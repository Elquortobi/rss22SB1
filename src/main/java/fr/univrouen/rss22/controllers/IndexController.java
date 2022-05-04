package fr.univrouen.rss22.controllers;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import fr.univrouen.rss22.entities.Author;
import fr.univrouen.rss22.entities.EntityList;
import fr.univrouen.rss22.entities.Item;
import fr.univrouen.rss22.repository.ItemRepository;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    private final ItemRepository itemRepository;

    public IndexController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String getAcceuil() throws IOException {
        org.springframework.core.io.Resource resource = new DefaultResourceLoader().getResource("classpath:acceuil.html");
        InputStream inputStream = resource.getInputStream();
        String acceuilPage = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        return acceuilPage;
    }

    @GetMapping(value = "items", produces = {"application/xml"})
    public EntityList<Item> getItems() {
        Item item = new Item();
        item.setTitle("test");
        item.setGuid(UUID.randomUUID());
        Author author = new Author();
        author.setName("el quortobi");
        item.setAuthors(Arrays.asList(author));
        List<Item> items = new ArrayList<>();
        items.add(item);
        return new EntityList<>(items);
    }

}
