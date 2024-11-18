package pl.rszczesiak.poc.architecture.demo.common.application.query;

import pl.rszczesiak.poc.architecture.demo.common.application.command.Command;

public interface QueryBus {

    <Q extends Command<R>, R> R dispatch(Q query);
}
