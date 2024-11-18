package pl.rszczesiak.poc.architecture.demo.application.port.out;

import pl.rszczesiak.poc.architecture.demo.domain.Post;

import java.util.List;

public interface PostRepositoryPort {

    void save(Post post);

    void saveAll(List<Post> post);
}
