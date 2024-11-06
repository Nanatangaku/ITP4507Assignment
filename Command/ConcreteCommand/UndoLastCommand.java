package Command.ConcreteCommand;

import Command.ActionofCommand;
import Command.CanUndoCommand;
import Command.HistoryCommand;


public class UndoLastCommand extends ActionofCommand{
    HistoryCommand historyCommand;

    public UndoLastCommand(HistoryCommand historyCommand) {
        super(historyCommand);
    }

    public void execute(){
        historyCommand.undoHisCmd();

    }
   
}