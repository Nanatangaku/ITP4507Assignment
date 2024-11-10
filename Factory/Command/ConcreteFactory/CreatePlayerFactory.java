package Factory.Command.ConcreteFactory;
import java.util.Scanner;


import Command.Command;
import Command.HistoryCommand;
import Factory.Command.CanUndoCommandFactory;
import Factory.Command.Player.PlayerFactory;
import Command.ConcreteCommand.CreatePlayer;

import Player.PlayerManager;
import Player.Player;


public class CreatePlayerFactory extends CanUndoCommandFactory {
    

    public CreatePlayerFactory(PlayerManager playerManager,Scanner scanner, HistoryCommand historyCommand) {
       super(playerManager,scanner,historyCommand);

    }

    public Command createCommand() {
        System.out.print("Player ID:");
        String playID = scanner.nextLine();
        System.out.print("Player Name:");
        String playerName = scanner.nextLine();
        PlayerFactory playerFactory = new PlayerFactory();
        Player player = playerFactory.createPlayer(playID, playerName);

        return new CreatePlayer(playerManager, historyCommand, player);
    }
    
}
