package Factory.Command.ConcreteFactory;

import Command.Command;
import Command.HistoryCommand;
import Factory.Command.CommandFactory;
import Command.ConcreteCommand.UndoLastCommand;

public class UndoLastCommandFactory extends CommandFactory {
    HistoryCommand historyCommand;
    public UndoLastCommandFactory(HistoryCommand historyCommand) {
        this.historyCommand = historyCommand;
    }
    public Command createCommand() {
        return new UndoLastCommand(historyCommand);
    }
    
}
