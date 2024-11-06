package Factory.Command.ConcreteFactory;

import Command.Command;
import Factory.Command.CanUndoCommandFactory;
import Factory.Command.CommandFactory;
import Command.ConcreteCommand.CallHeroSkill;
import Command.HistoryCommand;
import Player.PlayerManager;

public class CallHeroSkillFactory extends CanUndoCommandFactory {

    public CallHeroSkillFactory(PlayerManager playerManager, HistoryCommand historyCommand) {
        super(playerManager, historyCommand);
    }

    public Command createCommand() {
        return new CallHeroSkill(playerManager, historyCommand);
    }
    
}
