package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;
@XmlRootElement(name = "feed")
public class Feed {
    @XmlAttribute
    private String title;
    @XmlElement(type = Date.class)
    private Date pubDate;
    @XmlAttribute
    private String copyright;
    @XmlAttribute
    private String link;
    @XmlElement
    private List<Item> items;
}
