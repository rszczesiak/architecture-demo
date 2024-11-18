package pl.rszczesiak.poc.architecture.demo.domain;

public record Content(String value) {

    public Content {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Value must be provided");
        }
    }
}
