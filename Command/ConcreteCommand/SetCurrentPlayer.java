package Command.ConcreteCommand;

import java.util.Scanner;


import Player.PlayerManager;
import Command.PlayerManagerCommand;

public class SetCurrentPlayer extends PlayerManagerCommand{
    Scanner scanner;
    public SetCurrentPlayer(PlayerManager playerManager, Scanner scanner) {
        super(playerManager);
        this.scanner = scanner;
    }
    public void execute(){
       
   
        System.out.println("Please input player ID:- ");
        String playerID = scanner.nextLine();
        playerManager.setCurPlayer(playerID);
        
        
    }

    public String toString(){
        return "Command:Set Current Player";
    
    }
}
