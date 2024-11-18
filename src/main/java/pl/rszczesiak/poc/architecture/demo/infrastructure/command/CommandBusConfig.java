package pl.rszczesiak.poc.architecture.demo.infrastructure.command;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.rszczesiak.poc.architecture.demo.application.command.AddPostCommand;
import pl.rszczesiak.poc.architecture.demo.application.command.handler.AddPostCommandHandler;
import pl.rszczesiak.poc.architecture.demo.common.application.command.Command;
import pl.rszczesiak.poc.architecture.demo.common.application.command.CommandBus;
import pl.rszczesiak.poc.architecture.demo.common.application.command.handler.CommandHandler;

import java.util.Map;

@Configuration
class CommandBusConfig {

    @Bean
    CommandBus commandBus(AddPostCommandHandler addPostCommandHandler) {
        final Map<Class<? extends Command<?>>, CommandHandler<? extends Command<?>, ?>> handlers = Map.of(
                AddPostCommand.class, addPostCommandHandler
        );

        return new InMemoryCommandBus(handlers);
    }
}
