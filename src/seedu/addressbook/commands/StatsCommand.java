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
        List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
        int numberOfPeople = allPersons.size();
        String isOrAre = numberOfPeople == 1 ? "is" : "are";
        String peopleOrPerson = numberOfPeople == 1 ? "person" : "people";
        return new CommandResult(
                String.format(
                        Messages.MESSAGE_STATS_NUMBER_OF_PERSONS, isOrAre, numberOfPeople, peopleOrPerson)
                + "\n" + Messages.MESSAGE_STATS_LISTED_OVERVIEW);
    }
}
