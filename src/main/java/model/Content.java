package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "content")
public class Content {
    @XmlAttribute
    private String type;
    @XmlAttribute
    private String href;

}
