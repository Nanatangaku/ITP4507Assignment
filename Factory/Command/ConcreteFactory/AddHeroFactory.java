package Factory.Command.ConcreteFactory;

import java.util.Arrays;
import java.util.Scanner;


import Command.Command;
import Factory.Command.CanUndoCommandFactory;
import Factory.Command.CommandFactory;
import Command.ConcreteCommand.AddHero;
import Command.HistoryCommand;
import Player.PlayerManager;
import Hero.Hero;
import Hero.Warlock;
import Hero.Warrior;

public class AddHeroFactory extends CanUndoCommandFactory {
    //make a hero list have warlock and warrior
    String[] heroList = {"Warlock", "Warrior"};
    Hero hero;
    public AddHeroFactory(PlayerManager playerManager, HistoryCommand historyCommand) {
        super(playerManager, historyCommand);
    }
    public Command createCommand() {
        //ask the user create WarLock or Warrior
        System.out.println("Choose the hero you want to add " );
        //use foreach print the hero list 0 for the first 1 for the second hero 

        for (int i = 0; i < heroList.length; i++) {
            System.out.println(i + ": " + heroList[i]);
        }
        
        System.out.print(":");
        //get the user input
        Scanner scanner = new Scanner(System.in);
        String heroChoose = scanner.nextLine();
            System.out.print("Hero ID:");
            String heroID = scanner.nextLine();
            System.out.print("Hero Name:");
            String heroName = scanner.nextLine();
        

  

        if(heroChoose.equals("0")){
            hero = new Warlock(heroID, heroName);
        
    }else if(heroChoose.equals("1")){
        hero = new Warrior(heroID, heroName);
        
    }else{
        System.out.print("Invalid hero type");
    }
    return new AddHero(playerManager, historyCommand, hero);
    
}
}