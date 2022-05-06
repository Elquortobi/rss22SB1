package fr.univrouen.rss22.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@XmlRootElement(name = "flux")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class FluxDTO {
    private String xml;

    @XmlElement
    public void setXml(String xml) {
        this.xml = xml;
    }

    private FeedDTO feed;

    @XmlElement
    public void setFeed(FeedDTO feed) {
        this.feed = feed;
    }
}
