package fr.univrouen.rss22.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Data
public class Author {
    @Id
    @GeneratedValue
    private Long id;
    @XmlAttribute
    @Column
    private String name;
    @XmlAttribute
    @Column
    private String email;
    @XmlAttribute
    @Column
    private String uri;
}
