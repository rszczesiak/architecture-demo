package pl.rszczesiak.poc.architecture.demo.adapter.out.posting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.rszczesiak.poc.architecture.demo.application.port.out.PostingPlatformPort;

@Configuration
class PostingConfig {

    @Bean
    PostingPlatformPort postingPlatformPort() {
        return new InMemoryPostingPlatformAdapter();
    }
}
