package fr.univrouen.rss22.repository;

import fr.univrouen.rss22.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
