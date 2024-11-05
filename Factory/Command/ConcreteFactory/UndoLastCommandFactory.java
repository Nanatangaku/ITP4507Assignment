package Factory.Command.ConcreteFactory;

import Command.Command;
import Factory.Command.CommandFactory;
import Command.ConcreteCommand.UndoLastCommand;

public class UndoLastCommandFactory extends CommandFactory {
    public Command createCommand() {
        return new UndoLastCommand();
    }
    
}
