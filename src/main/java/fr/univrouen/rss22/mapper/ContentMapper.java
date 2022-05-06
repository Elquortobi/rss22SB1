package fr.univrouen.rss22.mapper;

import fr.univrouen.rss22.dto.ContentDTO;
import fr.univrouen.rss22.entity.Content;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ContentMapper {
    Content map(ContentDTO contentDTO);

    ContentDTO map(Content content);

    List<ContentDTO> map(List<Content> contents);
}
