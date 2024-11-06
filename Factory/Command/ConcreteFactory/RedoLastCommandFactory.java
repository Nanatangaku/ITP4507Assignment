package Factory.Command.ConcreteFactory;

import Command.Command;
import Command.HistoryCommand;
import Factory.Command.CanUndoCommandFactory;
import Factory.Command.CommandFactory;
import Player.PlayerManager;
import Command.ConcreteCommand.RedoLastCommand;

public class RedoLastCommandFactory extends CanUndoCommandFactory {

    public RedoLastCommandFactory(PlayerManager playerManager,HistoryCommand historyCommand) {
        super(playerManager, historyCommand);
    }
    public Command createCommand() {
        return new RedoLastCommand(playerManager, historyCommand);
    }
    
}
