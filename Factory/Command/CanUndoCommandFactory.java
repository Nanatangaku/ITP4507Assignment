package Factory.Command;

import Command.HistoryCommand;
import Player.PlayerManager;

public abstract class CanUndoCommandFactory extends PlayerManagerFactory{
    protected HistoryCommand historyCommand;
    public CanUndoCommandFactory(PlayerManager playerManager, HistoryCommand historyCommand){
       super(playerManager);

       if(historyCommand==null){
              throw new IllegalArgumentException("HistoryCommand cannot be null");
       }
       this.historyCommand=historyCommand;

    }
}