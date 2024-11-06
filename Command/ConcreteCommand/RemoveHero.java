package Command.ConcreteCommand;

import java.util.Vector;
import java.util.Scanner;

import Command.CanUndoCommand;
import Player.PlayerManager;
import Command.HistoryCommand;
import Hero.Hero;


public class RemoveHero extends CanUndoCommand{
    Hero hero;
    public RemoveHero(PlayerManager playerManager,HistoryCommand historyCommand){
        super(playerManager,historyCommand);

    }


    public void nowExecute(){

        //get the current user hero, ask user to input hero id to remove 
        //remove the hero from the user hero list
        //add the hero to the history command list

                Vector<Hero> heroList = playerManager.getCurPlayer().getHeroes();
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please input the hero id you want to remove: ");
                String heroId = scanner.nextLine();
                //find the hero id in the Vector hero
                for (int i = 0; i < heroList.size(); i++) {
                    if (heroList.get(i).getHeroID() == heroId) {
                        hero = heroList.get(i);
                        heroList.remove(i);
                        historyCommand.addCommand(this);
                        return;
                    }
                }




      
    }
    public void undo(){
        //add the hero back to the user hero list
        playerManager.getCurPlayer().getHeroes().add(hero);
    }
    
}
