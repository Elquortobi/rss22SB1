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
@XmlRootElement(name = "category")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class CategoryDTO {
    private String term;

    @XmlAttribute
    public void setTerm(String term) {
        this.term = term;
    }
}
