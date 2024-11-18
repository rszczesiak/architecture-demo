package pl.rszczesiak.poc.architecture.demo.application.query;

import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Value;
import pl.rszczesiak.poc.architecture.demo.application.dto.PostDto;
import pl.rszczesiak.poc.architecture.demo.common.application.query.Query;

import java.util.UUID;

@Value
@EqualsAndHashCode(callSuper = false)
public class GetPostQuery extends Query<PostDto> {

    @NotNull
    UUID id;

    public GetPostQuery(UUID id) {
        this.id = id;

        this.validateSelf();
    }
}
