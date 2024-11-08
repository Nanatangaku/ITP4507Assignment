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
    public AddHeroFactory(PlayerManager playerManager, HistoryCommand historyCommand, Scanner scanner) {
        super(playerManager, scanner, historyCommand);
    }
    public Command createCommand() {
        //ask the hero id and hero name in one line
        System.out.print("Please input hero information (id, name):-");
 
        String heroInfo = scanner.nextLine();
      
        String[] heroInfoArray = heroInfo.split(",");
        //if input is not in the format of id,name, return error message
        if(heroInfoArray.length != 2){
            System.out.print("You must input the format like \"id,name \"");
            return null;
        }
        String heroID = heroInfoArray[0];
        String heroName = heroInfoArray[1];
        System.out.print("Hero Type (1 = Warrior | 2 = Warlock ):-");
        String heroChoose = scanner.nextLine();
    
   
        

  

        if(heroChoose.equals("1")){
            hero = new Warlock(heroID, heroName);
            System.out.print(" Warlock is added ");
            return new AddHero(playerManager, historyCommand, hero);
    }else if(heroChoose.equals("2")){
        hero = new Warrior(heroID, heroName);
        System.out.print(" Warrior is added ");
        return new AddHero(playerManager, historyCommand, hero);
    }else{
        System.out.print(" Invalid hero type ");
        //return error message
    }
    //just end the function and back to main
    return null;
    
}
}