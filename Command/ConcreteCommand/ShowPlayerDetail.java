package Command.ConcreteCommand;

import Command.CanUndoCommand;
import Command.PlayerManagerCommand;
import Player.PlayerManager;

public class ShowPlayerDetail extends PlayerManagerCommand{

    public ShowPlayerDetail(PlayerManager playerManager) {
        super(playerManager);
    }
    public void execute(){
        System.out.print(playerManager.getPlayer());
    }
    
}
