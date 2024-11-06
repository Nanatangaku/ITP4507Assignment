package Factory.Command.ConcreteFactory;

import Command.CanUndoCommand;
import Command.Command;
import Factory.Command.CanUndoCommandFactory;
import Factory.Command.CommandFactory;
import Player.PlayerManager;
import Command.ConcreteCommand.RemoveHero;
import Command.HistoryCommand;


public class RemoveHeroFactory extends CanUndoCommandFactory {

    public RemoveHeroFactory(PlayerManager playerManager,HistoryCommand historyCommand) {
        super(playerManager,historyCommand);
    }
    
    public Command createCommand() {
        return new RemoveHero(playerManager,historyCommand);
    }


}
