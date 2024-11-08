package Command.ConcreteCommand;

import java.util.Vector;


import Command.PlayerManagerCommand;
import Player.PlayerManager;
import Hero.Hero;
import Player.Player;

public class ShowPlayerDetail extends PlayerManagerCommand {

    public ShowPlayerDetail(PlayerManager playerManager) {
        super(playerManager);
    }

    public void execute() {
        Player player = playerManager.getCurPlayer();
        System.out.println("Player Name: " + player.getPlayerName());
        // print the hero that current player has
        // use array list to store the hero
        Vector<Hero> heroList = playerManager.getCurPlayer().getHeroes();
        System.out.print("Hero List: \n");

        for (int i = 0; i < heroList.size(); i++) {
            heroList.get(i).showHeroStatus();

        }

    }
    public String toString(){
        return "Command:Show Player Detail";
    
    }

}
