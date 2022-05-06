package fr.univrouen.rss22.mapper;

import fr.univrouen.rss22.dto.ImageDTO;
import fr.univrouen.rss22.entity.Image;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ImageMapper {
    Image map(ImageDTO imageDTO);

    ImageDTO map(Image image);
}
