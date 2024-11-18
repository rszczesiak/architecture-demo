package pl.rszczesiak.poc.architecture.demo.application.command.handler;

import lombok.RequiredArgsConstructor;
import pl.rszczesiak.poc.architecture.demo.application.command.UpdatePostsFromPostingPlatformCommand;
import pl.rszczesiak.poc.architecture.demo.application.dto.PostDto;
import pl.rszczesiak.poc.architecture.demo.common.application.command.handler.CommandHandler;
import pl.rszczesiak.poc.architecture.demo.domain.Content;
import pl.rszczesiak.poc.architecture.demo.domain.Post;
import pl.rszczesiak.poc.architecture.demo.application.port.out.PostRepositoryPort;
import pl.rszczesiak.poc.architecture.demo.application.port.out.PostingPlatformPort;
import pl.rszczesiak.poc.architecture.demo.domain.Title;

import java.util.List;

@RequiredArgsConstructor
public class UpdatePostsFromPostingPlatformCommandHandler implements CommandHandler<UpdatePostsFromPostingPlatformCommand, Void> {

    private final PostingPlatformPort postingPlatformPort;
    private final PostRepositoryPort postRepositoryPort;

    @Override
    public Void handle(UpdatePostsFromPostingPlatformCommand command) {
        final List<PostDto> posts = postingPlatformPort.fetchPosts();
        postRepositoryPort.saveAll(createPostsFromDto(posts));

        return null;
    }

    private List<Post> createPostsFromDto(List<PostDto> posts) {
        return posts.stream()
                .map(post -> Post.create(new Title(post.title()), new Content(post.content())))
                .toList();
    }
}
