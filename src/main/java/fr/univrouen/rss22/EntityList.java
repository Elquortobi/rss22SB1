package fr.univrouen.rss22;

import fr.univrouen.rss22.dto.ItemDTO;
import fr.univrouen.rss22.entity.Item;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "item")
@XmlSeeAlso({ItemDTO.class})

public class EntityList<T> {

    private List<T> listOfEntityObjects;

    public EntityList() {
        listOfEntityObjects = new ArrayList<>();
    }

    public EntityList(List<T> listOfEntityObjects) {
        this.listOfEntityObjects = listOfEntityObjects;
    }

    @XmlAnyElement
    public List<T> getItems() {
        return listOfEntityObjects;
    }
}
