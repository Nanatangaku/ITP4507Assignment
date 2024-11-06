package Command.ConcreteCommand;

import java.util.Scanner;

import Command.CanUndoCommand;
import Command.HistoryCommand;
import Player.PlayerManager;
import Command.PlayerManagerCommand;

public class SetCurrentPlayer extends CanUndoCommand{

    public SetCurrentPlayer(PlayerManager PlayerManager,HistoryCommand historyCommand) {
        super(PlayerManager,historyCommand);
    }
    public void nowExecute(){
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the player ID You want to set : ");
        String playerID = scanner.nextLine();
        playerManager.setCurPlayer(playerID);
        System.out.println("Current Player is set to : "+playerManager.getCurPlayerID());
        
    }
    public void undo(){

    }
    
}
