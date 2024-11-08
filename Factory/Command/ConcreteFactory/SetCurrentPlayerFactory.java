package Factory.Command.ConcreteFactory;


import java.util.Scanner;

import Command.Command;

import Factory.Command.PlayerManagerFactory;
import Command.ConcreteCommand.SetCurrentPlayer;

import Player.PlayerManager;

public class SetCurrentPlayerFactory extends PlayerManagerFactory {

    public SetCurrentPlayerFactory(PlayerManager playerManager,Scanner scanner) {
        super(playerManager,scanner);
    }
    public Command createCommand() {
        return new SetCurrentPlayer(playerManager,scanner);
    }
    
}
