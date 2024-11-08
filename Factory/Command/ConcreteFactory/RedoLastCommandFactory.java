package Factory.Command.ConcreteFactory;

import java.util.Scanner;

import Command.Command;
import Command.HistoryCommand;
import Factory.Command.CanUndoCommandFactory;

import Player.PlayerManager;
import Command.ConcreteCommand.RedoLastCommand;

public class RedoLastCommandFactory extends CanUndoCommandFactory {

    public RedoLastCommandFactory(PlayerManager playerManager,Scanner scanner,HistoryCommand historyCommand) {
        super(playerManager,scanner, historyCommand);
    }
    public Command createCommand() {
        return new RedoLastCommand(playerManager, historyCommand);
    }
    
}
