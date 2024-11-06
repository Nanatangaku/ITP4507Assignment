package Command.ConcreteCommand;

import Command.ActionofCommand;
import Command.CanUndoCommand;
import Command.HistoryCommand;

public class ShowUndoRedoList extends ActionofCommand{

    public ShowUndoRedoList(HistoryCommand historyCommand) {
        super(historyCommand);
    }
    public void execute(){
        System.out.print(historyCommand.getHis());
    }
    
}
