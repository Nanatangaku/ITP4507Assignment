package Factory.Command.ConcreteFactory;

import Command.Command;
import Factory.Command.CommandFactory;
import Command.ConcreteCommand.ExitCommand;

public class ExitFactory extends CommandFactory {

    public Command createCommand() {
        return new ExitCommand();
    }
    
}
