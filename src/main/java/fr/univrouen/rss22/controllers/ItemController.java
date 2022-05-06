package fr.univrouen.rss22.controllers;

import fr.univrouen.rss22.EntityList;
import fr.univrouen.rss22.dto.ItemDTO;
import fr.univrouen.rss22.service.ItemService;
import io.swagger.v3.oas.annotations.OpenAPI30;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

@RestController
public class ItemController {
    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping(value = "/rss/resume/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public EntityList<ItemDTO> getItems() {
        if (itemService.getItems().isEmpty()) {
            return null;
        } else {
            return new EntityList<>(itemService.getItems());
        }

    }

    @GetMapping(value = "/rss/resume/xml/{guid}", produces = MediaType.APPLICATION_XML_VALUE)
    public ItemDTO getItem(@PathVariable String guid) {
        return itemService.getItem(guid);
    }

    @PostMapping(value = "/rss/insert")
    public ItemDTO addItem(@RequestBody String fluxXml) throws JAXBException, URISyntaxException {
        return itemService.addItem(fluxXml);
    }

    @Transactional
    @DeleteMapping("/delete/{guid}")
    public void deleteItem(@PathVariable String guid) {
        itemService.deleteItem(guid);
    }

   
}
