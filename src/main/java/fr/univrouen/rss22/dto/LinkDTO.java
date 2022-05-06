package fr.univrouen.rss22.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.net.URI;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@XmlRootElement(name = "link")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class LinkDTO {
    private Long id;
    private String rel;
    private String type;
    private URI href;

    public void setId(Long id) {
        this.id = id;
    }

    @XmlAttribute
    public void setRel(String rel) {
        this.rel = rel;
    }

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }

    @XmlAttribute
    public void setHref(URI href) {
        this.href = href;
    }
}
