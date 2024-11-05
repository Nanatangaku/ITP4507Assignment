package Factory.Command.ConcreteFactory;

import Command.Command;
import Factory.Command.CommandFactory;
import Command.ConcreteCommand.CreatePlayer;

public class CreatePlayerFactory extends CommandFactory {
    public Command createCommand() {
        return new CreatePlayer();
    }
    
}
