package Factory.Command;

import Player.PlayerManager;

public abstract class PlayerManagerFactory extends CommandFactory{
    protected PlayerManager playerManager;
    public PlayerManagerFactory(PlayerManager playerManager){
        if(playerManager==null)
        throw new IllegalArgumentException("PlayerManager cannot be null test1");
    this.playerManager=playerManager;
    }
}
