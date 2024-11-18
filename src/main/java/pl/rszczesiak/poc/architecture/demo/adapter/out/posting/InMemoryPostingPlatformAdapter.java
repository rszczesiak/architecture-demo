package pl.rszczesiak.poc.architecture.demo.adapter.out.posting;

import pl.rszczesiak.poc.architecture.demo.application.dto.PostDto;
import pl.rszczesiak.poc.architecture.demo.application.port.out.PostingPlatformPort;

import java.util.List;

class InMemoryPostingPlatformAdapter implements PostingPlatformPort {

    @Override
    public List<PostDto> fetchPosts() {
        return List.of(new PostDto("My title", "My content"));
    }
}
