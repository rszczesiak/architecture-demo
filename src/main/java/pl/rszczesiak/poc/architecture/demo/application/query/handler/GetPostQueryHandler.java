package pl.rszczesiak.poc.architecture.demo.application.query.handler;

import pl.rszczesiak.poc.architecture.demo.application.dto.PostDto;
import pl.rszczesiak.poc.architecture.demo.application.query.GetPostQuery;
import pl.rszczesiak.poc.architecture.demo.common.application.query.handler.QueryHandler;

public class GetPostQueryHandler implements QueryHandler<GetPostQuery, PostDto> {

    @Override
    public PostDto handle(GetPostQuery query) {
        return null;
    }
}
