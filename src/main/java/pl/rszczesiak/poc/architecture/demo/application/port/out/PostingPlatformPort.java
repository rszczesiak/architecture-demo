package pl.rszczesiak.poc.architecture.demo.application.port.out;

import pl.rszczesiak.poc.architecture.demo.application.dto.PostDto;

import java.util.List;

public interface PostingPlatformPort {

    List<PostDto> fetchPosts();
}
