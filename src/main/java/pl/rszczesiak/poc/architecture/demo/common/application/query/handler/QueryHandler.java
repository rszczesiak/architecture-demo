package pl.rszczesiak.poc.architecture.demo.common.application.query.handler;

import pl.rszczesiak.poc.architecture.demo.common.application.query.Query;

public interface QueryHandler<Q extends Query<R>, R> {

    R handle(Q query);
}
