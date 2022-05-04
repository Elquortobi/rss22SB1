package fr.univrouen.rss22.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;
@XmlRootElement(name = "feed")
@Entity
@Data
public class Feed {
    @Id
    @GeneratedValue
    private Long id;
    @XmlAttribute
    @Column
    private String title;
    @XmlElement(type = Date.class)
    @Column
    private Date pubDate;
    @XmlAttribute
    @Column
    private String copyright;
    @XmlAttribute
    @Column
    private String link;
    @XmlElement
    @OneToMany
    private List<Item> items;
}
