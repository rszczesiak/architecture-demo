package pl.rszczesiak.poc.architecture.demo.common.domain;

import pl.rszczesiak.poc.architecture.demo.common.validation.SelfValidating;

public abstract class Entity<ID> extends SelfValidating {

    ID id;

    protected Entity(ID id) {
        this.id = id;
    }

    ID id() {
        return this.id;
    }
}
