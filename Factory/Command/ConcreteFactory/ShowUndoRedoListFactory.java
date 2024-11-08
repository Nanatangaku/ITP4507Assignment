package Factory.Command.ConcreteFactory;

import java.util.Scanner;

import Command.Command;
import Command.HistoryCommand;
import Factory.Command.ActionofCommandFactory;

import Command.ConcreteCommand.ShowUndoRedoList;

public class ShowUndoRedoListFactory extends ActionofCommandFactory {

    public ShowUndoRedoListFactory(HistoryCommand historyCommand,Scanner scanner) {
        super(historyCommand,scanner);
    }
    public Command createCommand() {
        return new ShowUndoRedoList(historyCommand);
    }
    
}
