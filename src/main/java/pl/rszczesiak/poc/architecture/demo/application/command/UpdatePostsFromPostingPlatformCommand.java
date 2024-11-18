package pl.rszczesiak.poc.architecture.demo.application.command;

import lombok.EqualsAndHashCode;
import lombok.Value;
import pl.rszczesiak.poc.architecture.demo.common.application.command.Command;

@Value
@EqualsAndHashCode(callSuper = false)
public class UpdatePostsFromPostingPlatformCommand extends Command<Void> {

    public UpdatePostsFromPostingPlatformCommand() {
        this.validateSelf();
    }
}
