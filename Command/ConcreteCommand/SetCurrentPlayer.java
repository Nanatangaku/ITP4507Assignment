package Command.ConcreteCommand;

import java.util.Scanner;

import Command.CanUndoCommand;
import Command.HistoryCommand;
import Player.PlayerManager;
import Command.PlayerManagerCommand;

public class SetCurrentPlayer extends PlayerManagerCommand{

    public SetCurrentPlayer(PlayerManager playerManager) {
        super(playerManager);
    }
    public void execute(){
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the player ID You want to set : ");
        String playerID = scanner.nextLine();
        playerManager.setCurPlayer(playerID);
        System.out.println("Current Player is set to : "+playerManager.getCurPlayerID());
        
    }

    
}
