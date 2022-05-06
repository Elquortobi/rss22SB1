package fr.univrouen.rss22.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "item")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class ItemDTO {


    private String guid;

    private String title;

    private CategoryDTO categorie;

    private String date;

    private ImageDTO image;

    private ContentDTO content;

    private AuthorDTO author;

    @XmlElement
    public void setGuid(String guid) {
        this.guid = guid;
    }

    @XmlElement
    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElement(name = "category", type = CategoryDTO.class)
    public void setCategorie(CategoryDTO categorie) {
        this.categorie = categorie;
    }

    @XmlElement(name = "published")
    public void setDate(String date) {
        this.date = date;
    }

    @XmlElement
    public void setImage(ImageDTO image) {
        this.image = image;
    }

    @XmlElement
    public void setContent(ContentDTO content) {
        this.content = content;
    }

    @XmlElement(name = "author", type = AuthorDTO.class)
    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }
}
