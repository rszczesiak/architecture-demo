package pl.rszczesiak.poc.architecture.demo.common.application.command.handler;

import pl.rszczesiak.poc.architecture.demo.common.application.command.Command;

public interface CommandHandler<C extends Command<R>, R> {

    R handle(C command);
}
