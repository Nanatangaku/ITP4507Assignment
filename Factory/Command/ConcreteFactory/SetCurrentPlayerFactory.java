package Factory.Command.ConcreteFactory;


import Command.Command;
import Command.HistoryCommand;
import Factory.Command.CanUndoCommandFactory;
import Factory.Command.PlayerManagerFactory;
import Command.ConcreteCommand.SetCurrentPlayer;

import Player.PlayerManager;

public class SetCurrentPlayerFactory extends CanUndoCommandFactory {

    public SetCurrentPlayerFactory(PlayerManager playerManager,HistoryCommand historyCommand) {
        super(playerManager,historyCommand);
    }
    public Command createCommand() {
        return new SetCurrentPlayer(playerManager,historyCommand);
    }
    
}
