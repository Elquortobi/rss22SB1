package fr.univrouen.rss22.repository;

import fr.univrouen.rss22.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
