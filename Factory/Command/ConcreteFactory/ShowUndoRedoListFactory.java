package Factory.Command.ConcreteFactory;

import Command.Command;
import Factory.Command.CommandFactory;
import Command.ConcreteCommand.ShowUndoRedoList;

public class ShowUndoRedoListFactory extends CommandFactory {
    public Command createCommand() {
        return new ShowUndoRedoList();
    }
    
}
