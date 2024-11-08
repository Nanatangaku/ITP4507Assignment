package Command.ConcreteCommand;


import Command.CanUndoCommand;
import Player.Player;
import Command.HistoryCommand;

import Player.PlayerManager;
public class CreatePlayer extends CanUndoCommand{

    private Player player;
    private String curPlayerID;

    public CreatePlayer(PlayerManager playermanger, HistoryCommand historyCommand, Player player) {
        super(playermanger, historyCommand);
        if(player==null){
            throw new IllegalArgumentException("Player cannot be null");
        }else{
            this.player=player;
        }

    }
    public void nowExecute(){
        curPlayerID=playerManager.getCurPlayerID();
        playerManager.addPlayer(player);
    }


     
 
    
    public void undo(){
        playerManager.removePlayer(player);
       

    }
    public String toString(){
        return "Command:Create Player";
    }
}
