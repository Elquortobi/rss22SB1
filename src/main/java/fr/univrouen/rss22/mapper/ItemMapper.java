package fr.univrouen.rss22.mapper;

import fr.univrouen.rss22.dto.ItemDTO;
import fr.univrouen.rss22.entity.Author;
import fr.univrouen.rss22.entity.Category;
import fr.univrouen.rss22.entity.Image;
import fr.univrouen.rss22.entity.Item;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE, unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {CategoryMapper.class, ContentMapper.class, Author.class, ImageMapper.class})
public interface ItemMapper {
    Item map(ItemDTO itemDTO);

    ItemDTO map(Item item);

    List<ItemDTO> map(List<Item> items);
}
