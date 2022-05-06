package fr.univrouen.rss22.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@XmlRootElement(name = "author")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class AuthorDTO {

    private String name;
    private String mail;
    private String uri;

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "email")
    public void setMail(String mail) {
        this.mail = mail;
    }

    @XmlElement
    public void setUri(String uri) {
        this.uri = uri;
    }
}
