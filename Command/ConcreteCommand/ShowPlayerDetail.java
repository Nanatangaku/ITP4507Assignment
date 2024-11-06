package Command.ConcreteCommand;

import java.util.Vector;

import Command.CanUndoCommand;
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
        System.out.print("Player Name: " + player.getPlayerName());
        // print the hero that current player has
        // use array list to store the hero
        Vector<Hero> heroList = playerManager.getCurPlayer().getHeroes();
        String herolist = "Heros: \n";

        for (int i = 0; i < heroList.size(); i++) {
            // print the pattern like Hero ID: , Hero Name: , Hero type:, Hero HP:, Damage: the hero type will be show in class so check it from which class 
            // , Defense Point:
            heroList.get(i).showHeroStatus();
            System.out.println();
        }

    }

}
