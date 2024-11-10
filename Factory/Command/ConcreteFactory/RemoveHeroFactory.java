package Factory.Command.ConcreteFactory;

import java.util.Scanner;
import java.util.Vector;


import Command.Command;
import Factory.Command.CanUndoCommandFactory;

import Player.PlayerManager;
import Command.ConcreteCommand.RemoveHero;
import Command.HistoryCommand;
import Hero.Hero;


public class RemoveHeroFactory extends CanUndoCommandFactory {
    Scanner scanner;
    Hero hero;
    public RemoveHeroFactory(PlayerManager playerManager,Scanner scanner,HistoryCommand historyCommand) {
        super(playerManager,scanner,historyCommand);
        this.scanner = scanner;
    }
    
    public Command createCommand() {
        System.out.println("Please input the hero id you want to remove: ");
        String heroID = scanner.nextLine();
        Vector herolist = playerManager.getCurPlayer().getHeroes();
        for (int i = 0; i < herolist.size(); i++) {
            if(((Hero)herolist.get(i)).getHeroID().equals(heroID)){
                hero = (Hero)herolist.get(i);
                break;
            }
        }
        if(hero != null){
            return new RemoveHero(playerManager,historyCommand,hero);
        }else{
            throw new IllegalArgumentException("The hero is not in the player's hero list!");
        }

        
    }


}
