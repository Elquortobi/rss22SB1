package fr.univrouen.rss22.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@XmlRootElement(name = "image")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class ImageDTO {
    private Long id;

    private String alt;

    private String href;

    private int lenght;

    String type;

    public void setId(Long id) {
        this.id = id;
    }

    @XmlAttribute
    public void setAlt(String alt) {
        this.alt = alt;
    }

    @XmlAttribute
    public void setHref(String href) {
        this.href = href;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }


}
