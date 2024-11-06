package Factory.Command.ConcreteFactory;

import Command.Command;
import Command.HistoryCommand;
import Factory.Command.ActionofCommandFactory;

import Command.ConcreteCommand.ShowUndoRedoList;

public class ShowUndoRedoListFactory extends ActionofCommandFactory {

    public ShowUndoRedoListFactory(HistoryCommand historyCommand) {
        super(historyCommand);
    }
    public Command createCommand() {
        return new ShowUndoRedoList(historyCommand);
    }
    
}
