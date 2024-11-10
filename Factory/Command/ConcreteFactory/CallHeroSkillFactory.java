package Factory.Command.ConcreteFactory;

import java.util.Scanner;
import java.util.Vector;

import Command.Command;
import Factory.Command.CanUndoCommandFactory;

import Command.ConcreteCommand.CallHeroSkill;
import Command.HistoryCommand;
import Player.PlayerManager;
import Hero.Hero;
import Hero.Warlock;
import Hero.WarlockMemento;
import Hero.Warrior;
import Hero.WarriorMemento;

public class CallHeroSkillFactory extends CanUndoCommandFactory {
    Hero hero;

    public CallHeroSkillFactory(PlayerManager playerManager, HistoryCommand historyCommand, Scanner scanner) {
        super(playerManager, scanner, historyCommand);
    }

    public Command createCommand() {
        System.out.print("Please input the hero ID:");
        String heroID = scanner.nextLine();
        if (playerManager.getCurPlayer() == null) {
            System.out.println("Please select a player first!");
            hero = null;

            throw new IllegalArgumentException("Please create a player first!");
        }
        Vector <Hero> heroList = playerManager.getCurPlayer().getHeroes();

        
        // check the heroID is in the player's hero list
        for(int i =0; i<heroList.size();i++){
            if(heroList.get(i).getHeroID().equals(heroID)){
                break;
            }
            if(i == heroList.size()-1){
                System.out.println("The hero ID is not in the player's hero list!");
                hero = null;
                throw new IllegalArgumentException("The hero ID is not in the player's hero list!");
            }
        }
         //get the hero from the player's hero list
        for (int i = 0; i < heroList.size(); i++) {
            if (heroList.get(i).getHeroID().equals(heroID)) {
                hero = heroList.get(i);
                break;
            }
        }

        return new CallHeroSkill(playerManager, historyCommand, scanner,hero);
    }
    
}
