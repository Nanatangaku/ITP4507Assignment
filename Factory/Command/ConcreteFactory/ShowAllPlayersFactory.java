package Factory.Command.ConcreteFactory;


import Command.Command;
import Factory.Command.CommandFactory;
import Factory.Command.PlayerManagerFactory;
import Command.ConcreteCommand.ShowAllPlayers;
import Player.Player;
import Player.PlayerManager;

public class ShowAllPlayersFactory extends PlayerManagerFactory {
    

    public  ShowAllPlayersFactory(PlayerManager playerManager) {
        super(playerManager);
    }

    public Command createCommand() {
        return new ShowAllPlayers(playerManager);
    }

    
    
}
