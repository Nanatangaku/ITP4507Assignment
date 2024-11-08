package Command.ConcreteCommand;


import java.util.Vector;
import java.util.Scanner;
import java.util.Stack;

import Command.CanUndoCommand;
import Player.PlayerManager;
import Command.HistoryCommand;
import Hero.Hero;


public class RemoveHero extends CanUndoCommand{
    Hero hero;
    Scanner scanner;
    Stack<Hero> DisablleHeroStack = new Stack<Hero>();
    public RemoveHero(PlayerManager playerManager,HistoryCommand historyCommand,Scanner scanner){
        super(playerManager,historyCommand);
        this.scanner = scanner;
    }


    public void nowExecute(){

        //get the current user hero, ask user to input hero id to remove 
        //remove the hero from the user hero list
        //add the hero to the history command list

                Vector<Hero> heroList = playerManager.getCurPlayer().getHeroes();
                System.out.println("Please input the hero id you want to remove: ");
                String heroId = scanner.nextLine();
                //find the hero id in the Vector hero
                for (int i = 0; i < heroList.size(); i++) {
                    if (heroList.get(i).getHeroID().equals(heroId)) {
                        hero = heroList.get(i);
                        DisablleHeroStack.push(hero);
                        heroList.remove(i);
                        return;
                    }
                }




      
    }
    public void undo(){
        //add the hero back to the user hero list
        playerManager.getCurPlayer().getHeroes().add(DisablleHeroStack.pop());
    }
    public String toString(){
        return "Command:Remove Hero";
    
    }
}
