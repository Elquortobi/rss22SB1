package fr.univrouen.rss22.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@XmlRootElement(name = "feed")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class FeedDTO {
    private String title;
    private Date pubDate;
    private String copyright;
    private LinkDTO link;
    private List<ItemDTO> items;

    @XmlElement
    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElement
    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    @XmlElement
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    @XmlElement
    public void setLink(LinkDTO link) {
        this.link = link;
    }

    @XmlElement(name = "item")
    public void setItems(List<ItemDTO> items) {
        this.items = items;
    }
}
