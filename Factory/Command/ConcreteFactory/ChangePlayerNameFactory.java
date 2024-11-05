package Factory.Command.ConcreteFactory;

import Command.Command;
import Factory.Command.CommandFactory;
import Command.ConcreteCommand.ChangePlayerName;

public class ChangePlayerNameFactory extends CommandFactory {
    public Command createCommand() {
        return new ChangePlayerName();
    }


    
}
