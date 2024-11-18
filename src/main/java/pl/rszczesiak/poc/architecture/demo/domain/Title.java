package pl.rszczesiak.poc.architecture.demo.domain;

public record Title(String value) {

    public Title {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Value must be provided");
        }
    }
}
