package Factory.Command.ConcreteFactory;

import Command.Command;
import Factory.Command.CommandFactory;
import Factory.Command.PlayerManagerFactory;
import Command.ConcreteCommand.ChangePlayerName;
import Player.PlayerManager;

public class ChangePlayerNameFactory extends PlayerManagerFactory {

    public ChangePlayerNameFactory(PlayerManager playerManager) {
        super(playerManager);
    }
    public Command createCommand() {
        return new ChangePlayerName(playerManager);
    }


    
}
