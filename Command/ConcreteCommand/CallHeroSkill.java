package Command.ConcreteCommand;
import java.util.Vector;
import java.util.Scanner;

import Command.CanUndoCommand;
import Player.PlayerManager;
import Command.HistoryCommand;
import Hero.*;





public class CallHeroSkill extends CanUndoCommand{
    HeroMemento memento;
    public CallHeroSkill(PlayerManager playerManager, HistoryCommand historyCommand){
        super(playerManager, historyCommand);
    }

    public void nowExecute(){
        Scanner scanner = new Scanner(System.in);
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
                hero.callSkill();
                historyCommand.addCommand(this);
                return;
            }
        }

        
      


      
    }
    public void undo(){
        memento.restore();
    }
    
}
