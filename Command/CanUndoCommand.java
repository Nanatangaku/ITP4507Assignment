package Command;

import Player.PlayerManager;

public abstract class CanUndoCommand extends PlayerManagerCommand{
    protected HistoryCommand historyCommand;
    public CanUndoCommand(PlayerManager playerManager, HistoryCommand historyCommand){
        super(playerManager);
        if(historyCommand==null){
            throw new IllegalArgumentException("HistoryCommand cannot be null");
        }
        this.historyCommand=historyCommand;
    }
    
    public  void execute(){
        nowExecute();
        afterExecute();
    }

    public abstract void nowExecute();

    public  void afterExecute(){
        historyCommand.addCommand(this);
    };
    
    public abstract void undo();
}
