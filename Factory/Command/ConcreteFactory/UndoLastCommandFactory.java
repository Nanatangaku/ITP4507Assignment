package Factory.Command.ConcreteFactory;

import java.util.Scanner;

import Command.Command;
import Command.HistoryCommand;
import Command.ConcreteCommand.UndoLastCommand;
import Factory.Command.ActionofCommandFactory;

public class UndoLastCommandFactory extends ActionofCommandFactory {

    public UndoLastCommandFactory(HistoryCommand historyCommand,Scanner scanner) {
        super(historyCommand,scanner);
    }
    public Command createCommand() {
        return new UndoLastCommand(historyCommand);
    }
    
}
