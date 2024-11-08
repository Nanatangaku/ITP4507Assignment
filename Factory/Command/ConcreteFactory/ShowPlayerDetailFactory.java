package Factory.Command.ConcreteFactory;

import java.util.Scanner;

import Command.Command;

import Factory.Command.PlayerManagerFactory;
import Player.PlayerManager;
import Command.ConcreteCommand.ShowPlayerDetail;


public class ShowPlayerDetailFactory extends  PlayerManagerFactory {

    public ShowPlayerDetailFactory(PlayerManager playerManager,Scanner scanner) {
        super(playerManager,scanner);
    }

    public Command createCommand() {
        return new ShowPlayerDetail(playerManager);
    }
    
}
