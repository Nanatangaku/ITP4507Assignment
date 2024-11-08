package Factory.Command.ConcreteFactory;
import java.util.Scanner;


import Command.Command;
import Command.HistoryCommand;
import Factory.Command.CanUndoCommandFactory;

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
        if(playID == null || playerName == null || playID.isEmpty() || playerName.isEmpty()){
            return new CreatePlayer(playerManager, historyCommand, null);
        }
        Player player = new Player(playID, playerName);
        return new CreatePlayer(playerManager, historyCommand, player);
    }
    
}
