package Factory.Command.ConcreteFactory;

import Command.Command;

import Factory.Command.PlayerManagerFactory;
import Player.PlayerManager;
import Command.ConcreteCommand.ShowPlayerDetail;


public class ShowPlayerDetailFactory extends  PlayerManagerFactory {

    public ShowPlayerDetailFactory(PlayerManager playerManager) {
        super(playerManager);
    }

    public Command createCommand() {
        return new ShowPlayerDetail(playerManager);
    }
    
}
