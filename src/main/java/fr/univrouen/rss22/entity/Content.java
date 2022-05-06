package fr.univrouen.rss22.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Content {
    @Id
    @GeneratedValue
    private Long id;
    private String type;
    private String href;
    @Column(columnDefinition = "TEXT")
    private String value;

}
