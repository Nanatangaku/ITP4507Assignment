package Command.ConcreteCommand;

import Command.CanUndoCommand;
import Player.PlayerManager;
import Command.HistoryCommand;

public class RedoLastCommand extends CanUndoCommand{

    public RedoLastCommand(PlayerManager playerManager,HistoryCommand historyCommand) {
        super(playerManager, historyCommand);

    }

    public void nowExecute(){
        historyCommand.redoHisCmd();
    }
    public void undo(){
        historyCommand.undoHisCmd();
    }
    public String toString(){
        return "Command:Redo Last Command";
    
    }
    
}
