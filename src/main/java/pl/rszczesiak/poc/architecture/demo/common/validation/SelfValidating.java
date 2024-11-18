package pl.rszczesiak.poc.architecture.demo.common.validation;

public abstract class SelfValidating {

    protected void validateSelf() {
        ValidatorUtil.validate(this);
    }
}
