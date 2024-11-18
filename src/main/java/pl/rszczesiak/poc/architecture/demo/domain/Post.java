package pl.rszczesiak.poc.architecture.demo.domain;

import pl.rszczesiak.poc.architecture.demo.common.domain.Entity;

import java.util.UUID;

public class Post extends Entity<UUID> {

    private final Title title;
    private final Content content;

    public static Post create(Title title, Content content) {
        if (title == null) {
            throw new IllegalArgumentException("Title must be provided");
        }
        if (content == null) {
            throw new IllegalArgumentException("Content must be provided");
        }
        return new Post(title, content);
    }

    private Post(Title title, Content content) {
        super(UUID.randomUUID());
        this.title = title;
        this.content = content;
    }

    private Post(UUID id, Title title, Content content) {
        super(id);
        this.title = title;
        this.content = content;
    }
}
