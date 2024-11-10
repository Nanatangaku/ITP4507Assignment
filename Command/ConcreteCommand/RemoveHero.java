package Command.ConcreteCommand;


import java.util.Vector;

import java.util.Stack;

import Command.CanUndoCommand;
import Player.PlayerManager;
import Command.HistoryCommand;
import Hero.Hero;


public class RemoveHero extends CanUndoCommand{
    Hero hero;


    Stack<Hero> DisablleHeroStack = new Stack<Hero>();
    public RemoveHero(PlayerManager playerManager,HistoryCommand historyCommand,Hero hero) {
        super(playerManager,historyCommand);
        this.hero = hero;

    }


    public void nowExecute(){

        //remove the hero from the user hero list
        playerManager.getCurPlayer().getHeroes().remove(hero);
        DisablleHeroStack.push(hero);



      
    }
    public void undo(){
        //add the hero back to the user hero list
        playerManager.getCurPlayer().getHeroes().add(DisablleHeroStack.pop());
    }
    public String toString(){
        return "Command:Remove Hero";
    
    }
}
