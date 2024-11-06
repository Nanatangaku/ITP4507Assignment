package Command.ConcreteCommand;

import java.util.Scanner;
import java.util.Vector;

import Command.CanUndoCommand;
import Player.Player;
import Command.HistoryCommand;
import Factory.Command.Player.PlayerFactory;
import Player.PlayerManager;
public class CreatePlayer extends CanUndoCommand{

    private Player player;
    private String curPlayerID;

    public CreatePlayer(PlayerManager playermanger, HistoryCommand historyCommand, Player player) {
        super(playermanger, historyCommand);
        this.player = player;

    }
    public void nowExecute(){
        curPlayerID=playerManager.getCurPlayerID();
        playerManager.addPlayer(player);
        playerManager.setCurPlayer(player.getPlayerID());
        historyCommand.addCommand(this);
        // System.out.print(playerManager.getPlayer());
        // System.out.print(historyCommand.getHis());
    }


     
 
    
    public void undo(){
        playerManager.removePlayer(player);
       

    }
    
}
