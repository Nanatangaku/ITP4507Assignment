package Command;
import Player.PlayerManager;

public abstract class PlayerManagerCommand extends Command{
    protected PlayerManager playerManager;
    public PlayerManagerCommand(PlayerManager playerManager){
        if(playerManager==null)
        throw new IllegalArgumentException("PlayerManager cannot be null test2");
    this.playerManager=playerManager;
    }

}
