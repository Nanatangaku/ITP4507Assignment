package Factory;

import Command.HistoryCommand;
import Factory.Command.CommandFactory;

public abstract class ActionofCommandFactory extends CommandFactory{

    protected HistoryCommand historyCommand;

    public ActionofCommandFactory(HistoryCommand historyCommand){
        if(historyCommand==null){
            throw new IllegalArgumentException("HistoryCommand cannot be null");
        }
        this.historyCommand=historyCommand;
    }
    
}
