package pl.rszczesiak.poc.architecture.demo.common.application.command;

public interface CommandBus {

    <C extends Command<R>, R> R dispatch(C command);
}
