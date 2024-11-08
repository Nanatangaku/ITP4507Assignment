package Factory.Command;

import java.util.Scanner;

import Command.HistoryCommand;
import Player.PlayerManager;


public abstract class CanUndoCommandFactory extends PlayerManagerFactory{
    protected HistoryCommand historyCommand;
    public CanUndoCommandFactory(PlayerManager playerManager, Scanner Scanner,HistoryCommand historyCommand){
       super(playerManager, Scanner);

       if(historyCommand==null){
              throw new IllegalArgumentException("HistoryCommand cannot be null");
       }
       this.historyCommand=historyCommand;

    }
}