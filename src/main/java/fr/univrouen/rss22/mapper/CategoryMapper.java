package fr.univrouen.rss22.mapper;

import fr.univrouen.rss22.dto.CategoryDTO;
import fr.univrouen.rss22.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryMapper {
    Category map(CategoryDTO categoryDTO);

    CategoryDTO map(Category category);

    List<CategoryDTO> map(List<Category> categories);
}
