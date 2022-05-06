package fr.univrouen.rss22.repository;

import fr.univrouen.rss22.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findByGuid(String guid);

    void deleteByGuid(String guid);
}
