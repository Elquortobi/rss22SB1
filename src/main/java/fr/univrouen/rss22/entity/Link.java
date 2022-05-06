package fr.univrouen.rss22.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.net.URI;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Link {
    @Id
    @GeneratedValue
    private Long id;

    private String rel;
    private String type;
    private URI href;

}
