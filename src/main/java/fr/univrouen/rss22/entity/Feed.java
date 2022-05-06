package fr.univrouen.rss22.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Feed {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Date pubDate;
    private String copyright;
    @OneToOne
    private Link link;
    @OneToMany
    private List<Item> items;
}
