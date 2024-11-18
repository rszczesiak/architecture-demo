package pl.rszczesiak.poc.architecture.demo.application.query.handler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class QueryHandlerConfig {

    @Bean
    GetPostQueryHandler getPostQueryHandler() {
        return new GetPostQueryHandler();
    }
}
