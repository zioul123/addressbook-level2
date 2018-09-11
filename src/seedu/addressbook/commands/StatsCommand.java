package seedu.addressbook.commands;

import seedu.addressbook.common.Messages;
import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.List;


/**
 * Lists all persons in the address book to the user.
 */
public class StatsCommand extends Command {

    public static final String COMMAND_WORD = "stats";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Shows statistics of the address book.\n"
            + "Example: " + COMMAND_WORD;


    @Override
    public CommandResult execute() {
        //List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
        return new CommandResult(Messages.MESSAGE_STATS_LISTED_OVERVIEW);
        //return new CommandResult(getMessageForPersonListShownSummary(allPersons), allPersons);
    }
}
