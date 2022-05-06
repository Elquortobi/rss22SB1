package fr.univrouen.rss22.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@XmlRootElement(name = "content")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class ContentDTO {
    private String href;

    private String type;

    @XmlAttribute
    public void setHref(String href) {
        this.href = href;
    }

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }

    @XmlValue
    public void setValue(String value) {
        this.value = value;
    }

    private String value;
}
