package seedu.taskmaster.logic.commands;

import seedu.taskmaster.logic.commands.exceptions.CommandException;
import seedu.taskmaster.model.Model;

import static java.util.Objects.requireNonNull;

public class RandomStudentCommand extends Command {
    public static final String COMMAND_WORD = "random-student";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Gets a random student to call.\n"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "Listed student";

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);

        model.showRandomStudent();

        return new CommandResult(MESSAGE_SUCCESS);
    }
}
