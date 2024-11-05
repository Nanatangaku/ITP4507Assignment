package Factory.Command.ConcreteFactory;

import Command.Command;
import Factory.Command.CommandFactory;
import Command.ConcreteCommand.SelectPlayer;

public class SelectPlayerFactory extends CommandFactory {

    public Command createCommand() {
        return new SelectPlayer();
    }
    
}
