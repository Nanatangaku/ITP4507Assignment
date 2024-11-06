package Factory.Command.ConcreteFactory;

import Command.Command;
import Command.HistoryCommand;
import Command.ConcreteCommand.UndoLastCommand;
import Factory.Command.ActionofCommandFactory;

public class UndoLastCommandFactory extends ActionofCommandFactory {

    public UndoLastCommandFactory(HistoryCommand historyCommand) {
        super(historyCommand);
    }
    public Command createCommand() {
        return new UndoLastCommand(historyCommand);
    }
    
}
