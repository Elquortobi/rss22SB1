package fr.univrouen.rss22.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Author {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String uri;
}
