package fr.univrouen.rss22.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Item {

    @Id
    @GeneratedValue
    private Long id;

    private String guid;
    private String title;
    @OneToOne(cascade = CascadeType.ALL)
    private Category categorie;
    private String date;
    @OneToOne(cascade = CascadeType.ALL)
    private Image image;
    @OneToOne(cascade = CascadeType.ALL)
    private Content content;
    @OneToOne(cascade = CascadeType.ALL)
    private Author author;
}
