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
    public CallHeroSkill(PlayerManager playerManager, HistoryCommand historyCommand, Scanner scanner){
        super(playerManager, historyCommand);
        this.scanner = scanner;
    }

    public void nowExecute(){
        System.out.print("Please input the hero ID:");
        String heroID = scanner.nextLine();
        Vector <Hero> heroList = playerManager.getCurPlayer().getHeroes();

        if (playerManager.getCurPlayer() == null) {
            System.out.println("Please select a player first!");
            return;
        }


        for (int i = 0; i < heroList.size(); i++) {
            if (heroList.get(i).getHeroID().equals(heroID)) {
                if(heroList.get(i) instanceof Warlock){
                    memento = new WarlockMemento((Warlock)heroList.get(i));
                }else{
                    memento = new WarriorMemento((Warrior)heroList.get(i));
                }
                Hero hero = heroList.get(i);
                System.out.println("Hero status before calling the skill:");
                hero.showHeroStatus();
                hero.callSkill();
                //show the hero status after calling the skill
                System.out.println("Hero status after calling the skill:");
                hero.showHeroStatus();
                return;
            }
        }

        
      


      
    }
    public void undo(){
        memento.restore();
    }

    public String toString(){
        return "Command:Call Hero Skill";
    }
}
