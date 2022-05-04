package fr.univrouen.rss22.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "image")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Data
public class Image {
    @Id
    @GeneratedValue
    private Long id;
    @XmlAttribute
    @Column
    private String type;
    @XmlAttribute
    @Column
    private String href;
    @XmlAttribute
    @Column
    private String alt;
    @XmlAttribute
    @Column
    private int length;
}
