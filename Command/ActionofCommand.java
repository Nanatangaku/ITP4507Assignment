package Command;

public abstract class ActionofCommand extends Command{
    protected HistoryCommand historyCommand;
    public ActionofCommand(HistoryCommand historyCommand){
        if(historyCommand==null){
            throw new IllegalArgumentException("HistoryCommand cannot be null(Command)");
        }
        this.historyCommand=historyCommand;
    }

}
