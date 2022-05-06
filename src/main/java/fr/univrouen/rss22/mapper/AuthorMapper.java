package fr.univrouen.rss22.mapper;

import fr.univrouen.rss22.dto.AuthorDTO;
import fr.univrouen.rss22.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthorMapper {

    Author map(AuthorDTO authorDTO);

    AuthorDTO map(Author author);

    List<AuthorDTO> map(List<Author> authors);
}
