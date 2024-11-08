package Factory.Command;

import java.util.Scanner;
import Command.HistoryCommand;

public abstract class ActionofCommandFactory extends CommandFactory{

    protected HistoryCommand historyCommand;

    public ActionofCommandFactory(HistoryCommand historyCommand,Scanner scanner){
        super(scanner);
        if(historyCommand==null){
            throw new IllegalArgumentException("HistoryCommand cannot be null(Command Factory)");
        }
        this.historyCommand=historyCommand;
    }
    
}
