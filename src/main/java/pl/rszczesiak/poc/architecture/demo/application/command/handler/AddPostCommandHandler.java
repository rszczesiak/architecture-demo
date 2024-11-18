package pl.rszczesiak.poc.architecture.demo.application.command.handler;

import pl.rszczesiak.poc.architecture.demo.application.command.AddPostCommand;
import pl.rszczesiak.poc.architecture.demo.common.application.command.handler.CommandHandler;

import java.util.UUID;

public class AddPostCommandHandler implements CommandHandler<AddPostCommand, UUID> {

    @Override
    public UUID handle(AddPostCommand command) {
        return UUID.randomUUID();
    }
}
