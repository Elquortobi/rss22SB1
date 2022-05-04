package fr.univrouen.rss22.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlElement;
@Entity
@Data
public class Flux {
    @Id
    @GeneratedValue
    private Long id;
    @XmlElement
    private String xml;
    @XmlElement
    @OneToOne
    private Feed feed;

}
