package Factory.Command.ConcreteFactory;


import java.util.Scanner;

import Command.Command;
import Factory.Command.CommandFactory;
import Factory.Command.PlayerManagerFactory;
import Command.ConcreteCommand.ShowAllPlayers;
import Player.Player;
import Player.PlayerManager;

public class ShowAllPlayersFactory extends PlayerManagerFactory {
    

    public  ShowAllPlayersFactory(PlayerManager playerManager,Scanner scanner) {
        super(playerManager,scanner);
    }

    public Command createCommand() {
        return new ShowAllPlayers(playerManager);
    }

    
    
}
