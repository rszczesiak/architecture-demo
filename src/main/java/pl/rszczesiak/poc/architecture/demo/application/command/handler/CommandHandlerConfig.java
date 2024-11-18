package pl.rszczesiak.poc.architecture.demo.application.command.handler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.rszczesiak.poc.architecture.demo.application.port.out.PostRepositoryPort;
import pl.rszczesiak.poc.architecture.demo.application.port.out.PostingPlatformPort;

@Configuration
class CommandHandlerConfig {

    @Bean
    AddPostCommandHandler addPostCommandHandler() {
        return new AddPostCommandHandler();
    }

    @Bean
    UpdatePostsFromPostingPlatformCommandHandler updatePostsFromPostingPlatformCommandHandler(
            PostingPlatformPort postingPlatformPort,
            PostRepositoryPort postRepositoryPort
    ) {
        return new UpdatePostsFromPostingPlatformCommandHandler(postingPlatformPort, postRepositoryPort);
    }
}
