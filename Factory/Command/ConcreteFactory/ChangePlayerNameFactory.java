package Factory.Command.ConcreteFactory;



import java.util.Scanner;


import Command.Command;
import Command.HistoryCommand;
import Factory.Command.CanUndoCommandFactory;

import Command.ConcreteCommand.ChangePlayerName;
import Player.PlayerManager;


public class ChangePlayerNameFactory extends CanUndoCommandFactory {

    public ChangePlayerNameFactory(PlayerManager playerManager,Scanner scanner, HistoryCommand historyCommand) {
        super(playerManager,scanner, historyCommand);
    }
    public Command createCommand() {
        return new ChangePlayerName(playerManager,historyCommand);
    }


    
}
