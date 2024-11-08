package Factory.Command;

import java.util.Scanner;

import Player.PlayerManager;

public abstract class PlayerManagerFactory extends CommandFactory{
    protected PlayerManager playerManager;
    public PlayerManagerFactory(PlayerManager playerManager,Scanner scanner){
        super(scanner);
        if(playerManager==null)
        throw new IllegalArgumentException("PlayerManager cannot be null test1");
    this.playerManager=playerManager;
    }
}
