package Factory.Command.ConcreteFactory;

import Command.Command;
import Factory.Command.CommandFactory;
import Command.ConcreteCommand.ShowAllPlayers;


public class ShowAllPlayersFactory extends CommandFactory {

    public Command createCommand() {
        return new ShowAllPlayers();
    }

    
    
}
