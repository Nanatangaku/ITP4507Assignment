package Factory.Command.ConcreteFactory;

import Command.CanUndoCommand;
import Command.Command;
import Command.HistoryCommand;
import Factory.Command.CanUndoCommandFactory;
import Factory.Command.CommandFactory;
import Factory.Command.PlayerManagerFactory;
import Command.ConcreteCommand.ChangePlayerName;
import Player.PlayerManager;


public class ChangePlayerNameFactory extends CanUndoCommandFactory {

    public ChangePlayerNameFactory(PlayerManager playerManager, HistoryCommand historyCommand) {
        super(playerManager, historyCommand);
    }
    public Command createCommand() {
        return new ChangePlayerName(playerManager,historyCommand);
    }


    
}
