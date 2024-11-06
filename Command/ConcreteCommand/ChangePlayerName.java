package Command.ConcreteCommand;


import Command.PlayerManagerCommand;
import Player.PlayerManager;

public class ChangePlayerName extends PlayerManagerCommand{
    public ChangePlayerName(PlayerManager playerManager){
        super(playerManager);
    }
    public void execute(){
      playerManager.changeName();
    }

    
}
