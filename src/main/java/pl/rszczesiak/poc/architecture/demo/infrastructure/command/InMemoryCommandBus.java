package pl.rszczesiak.poc.architecture.demo.infrastructure.command;

import lombok.RequiredArgsConstructor;
import pl.rszczesiak.poc.architecture.demo.common.application.command.Command;
import pl.rszczesiak.poc.architecture.demo.common.application.command.CommandBus;
import pl.rszczesiak.poc.architecture.demo.common.application.command.handler.CommandHandler;

import java.util.Map;

@RequiredArgsConstructor
class InMemoryCommandBus implements CommandBus {

    private final Map<Class<? extends Command<?>>, CommandHandler<? extends Command<?>, ?>> handlers;

    @SuppressWarnings("unchecked")
    @Override
    public <C extends Command<R>, R> R dispatch(C command) {
        final CommandHandler<C, R> handler = (CommandHandler<C, R>) handlers.get(command.getClass());
        if (handler == null) {
            throw new IllegalStateException(String.format("No command handler found for %s", command.getClass().getName()));
        }

        return handler.handle(command);
    }
}
