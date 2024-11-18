package pl.rszczesiak.poc.architecture.demo.application.command;

import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Value;
import pl.rszczesiak.poc.architecture.demo.common.application.command.Command;

import java.util.UUID;

@Value
@EqualsAndHashCode(callSuper = false)
public class AddPostCommand extends Command<UUID> {

    @NotBlank
    String title;
    @NotBlank
    String content;

    public AddPostCommand(String title, String content) {
        this.title = title;
        this.content = content;

        this.validateSelf();
    }
}
