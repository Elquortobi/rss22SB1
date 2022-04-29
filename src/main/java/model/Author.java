package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Author {
    @XmlAttribute
    private String name;
    @XmlAttribute
    private String email;
    @XmlAttribute
    private String uri;
}
