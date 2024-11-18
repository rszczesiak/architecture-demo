package pl.rszczesiak.poc.architecture.demo.common.validation;

import jakarta.validation.*;

import java.util.Set;

public class ValidatorUtil {

    private static final Validator validator;

    private ValidatorUtil() {
        throw new AssertionError("ValidatorUtil cannot be instantiated");
    }

    static {
        final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    public static <T> void validate(T toValidate) {
        final Set<ConstraintViolation<T>> violations = validator.validate(toValidate);
        if (!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }
    }

}
