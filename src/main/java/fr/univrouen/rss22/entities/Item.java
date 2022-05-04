package fr.univrouen.rss22.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "item")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Data
public class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    @XmlAttribute
    @Id
    private UUID guid;
    @XmlElement
    @Column
    private String title;
    @XmlElement
    @OneToMany
    private List<Category> categories;
    @XmlElements({
            @XmlElement(name = "published", type = Date.class),
            @XmlElement(name = "updated", type = Date.class)
    })
    @Column
    private Date date;
    @XmlElement(type = Image.class)
    @OneToOne
    private Image image;
    @XmlElement(type = Content.class)
    @OneToOne
    @JsonIgnore
    private Content content;
    @XmlElements({
            @XmlElement(name = "author", type = Author.class),
            @XmlElement(name = "contributor", type = Author.class)
    })
    @OneToMany
    private List<Author> authors;
}
