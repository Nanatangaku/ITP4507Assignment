package Factory.Command.ConcreteFactory;
import java.util.Scanner;


import Command.Command;
import Command.HistoryCommand;
import Factory.Command.CanUndoCommandFactory;

import Command.ConcreteCommand.CreatePlayer;

import Player.PlayerManager;
import Player.Player;


public class CreatePlayerFactory extends CanUndoCommandFactory {

    public CreatePlayerFactory(PlayerManager playerManager, HistoryCommand historyCommand) {
       super(playerManager, historyCommand);
    }

    public Command createCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player ID:");
        String playID = scanner.nextLine();
        System.out.print("Player Name:");
        String playerName = scanner.nextLine();
        Player player = new Player(playID, playerName);
        return new CreatePlayer(playerManager, historyCommand, player);
    }
    
}
