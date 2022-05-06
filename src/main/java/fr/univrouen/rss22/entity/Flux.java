package fr.univrouen.rss22.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Flux {
    @Id
    @GeneratedValue
    private Long id;
    private String xml;
    @OneToOne
    private Feed feed;

}
