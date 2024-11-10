package Command.ConcreteCommand;
import java.util.Vector;
import java.util.Scanner;

import Command.CanUndoCommand;
import Player.PlayerManager;
import Command.HistoryCommand;
import Hero.*;





public class CallHeroSkill extends CanUndoCommand{
    HeroMemento memento;
    Scanner scanner;
    Hero hero;
    public CallHeroSkill(PlayerManager playerManager, HistoryCommand historyCommand, Scanner scanner,Hero hero){
        super(playerManager, historyCommand);
        this.scanner = scanner;
        if(hero != null){
            this.hero = hero;
        }
    }

    public void nowExecute(){

        System.out.print("Hero Status before calling skill: ");
        hero.showHeroStatus();
        if(hero.getClass() == Warrior.class){
            memento = new WarriorMemento((Warrior)hero);
        }else if(hero.getClass() == Warlock.class){
            memento = new WarlockMemento((Warlock)hero);
        }
        hero.callSkill();
        System.out.print("Hero Status after calling skill: ");
        hero.showHeroStatus();

        
      


      
    }
    public void undo(){
        memento.restore();
    }

    public String toString(){
        return "Command:Call Hero Skill";
    }
}
