package Factory.Command.ConcreteFactory;

import Command.Command;
import Factory.Command.CommandFactory;
import Command.ConcreteCommand.RedoLastCommand;

public class RedoLastCommandFactory extends CommandFactory {
    public Command createCommand() {
        return new RedoLastCommand();
    }
    
}
