package fr.univrouen.rss22.service;

import fr.univrouen.rss22.dto.ItemDTO;
import fr.univrouen.rss22.entity.Item;
import fr.univrouen.rss22.mapper.ItemMapper;
import fr.univrouen.rss22.repository.ItemRepository;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.UUID;

@Service
public class ItemService {
    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    public ItemService(ItemRepository itemRepository, ItemMapper itemMapper) {
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;
    }

    public List<ItemDTO> getItems() {
        return itemMapper.map(itemRepository.findAll());
    }

    public ItemDTO getItem(String guid) {
        return itemMapper.map(itemRepository.findByGuid(guid));
    }

    public ItemDTO addItem(String xmlFlux) throws URISyntaxException, JAXBException {
        if (isValidFlux(xmlFlux)) {
            JAXBContext jaxbContext = JAXBContext.newInstance(ItemDTO.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            StreamSource streamSource = new StreamSource(new StringReader(xmlFlux));
            JAXBElement<ItemDTO> jaxbElement = unmarshaller.unmarshal(streamSource, ItemDTO.class);
            ItemDTO itemDTO = (ItemDTO) jaxbElement.getValue();
            Item addedItem = itemRepository.save(itemMapper.map(itemDTO));
            return itemMapper.map(addedItem);
        }
        return null;
    }

    public void deleteItem(String guid) {
        itemRepository.deleteByGuid(guid);
    }

    Boolean isValidFlux(String xmlFlux) throws URISyntaxException {
        URL url = getClass().getClassLoader().getResource("item.xsd");
        if (url == null) {
            throw new IllegalArgumentException("xsd file not found!");
        } else {
            File xsdFile = new File(url.toURI());
            Source xml = new StreamSource(new StringReader(xmlFlux));
            try {
                SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
                Schema schema = schemaFactory.newSchema(xsdFile);
                Validator validator = schema.newValidator();
                validator.validate(xml);
            } catch (SAXException | IOException e) {
                e.printStackTrace();
            }
            return true;
        }


    }


}
