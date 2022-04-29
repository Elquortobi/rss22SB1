package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "image")
@XmlAccessorType(XmlAccessType.FIELD)
public class Image {
    @XmlAttribute
    private String type;
    @XmlAttribute
    private String href;
    @XmlAttribute
    private String alt;
    @XmlAttribute
    private int length;
}
