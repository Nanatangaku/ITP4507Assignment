package Command.ConcreteCommand;

import Command.ActionofCommand;
import Command.CanUndoCommand;
import Command.HistoryCommand;


public class UndoLastCommand extends ActionofCommand{


    public UndoLastCommand(HistoryCommand historyCommand) {
        super(historyCommand);
    }

    public void execute(){
        historyCommand.undoHisCmd();

    }
    public String toString(){
        return "Command:Undo Last Command";
    
    }
   
}