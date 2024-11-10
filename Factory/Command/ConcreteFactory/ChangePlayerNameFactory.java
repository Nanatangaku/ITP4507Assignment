package Factory.Command.ConcreteFactory;

import java.util.Scanner;

import Command.Command;
import Command.HistoryCommand;
import Factory.Command.CanUndoCommandFactory;

import Command.ConcreteCommand.ChangePlayerName;
import Player.PlayerManager;
import Player.Player;

public class ChangePlayerNameFactory extends CanUndoCommandFactory {

    public ChangePlayerNameFactory(PlayerManager playerManager, Scanner scanner, HistoryCommand historyCommand) {
        super(playerManager, scanner, historyCommand);
    }

    public Command createCommand() {
        System.out.print("Player ID:");
        String playID = scanner.nextLine();
        if (playerManager.getPlayerByID(playID) == null) {
            throw new IllegalArgumentException("The player ID is not in the player list!");
        }

        Player player = playerManager.getPlayerByID(playID);
        System.out.print("New Player Name:");
        String playerName = scanner.nextLine();
        if (playerName.equals("")) {
            throw new IllegalArgumentException("The player name cannot be empty!");
        } else {
            return new ChangePlayerName(playerManager, historyCommand, player, playerName);
        }

    }

}
