package Factory.Command.ConcreteFactory;


import java.util.Scanner;


import Command.Command;
import Factory.Command.CanUndoCommandFactory;
import Factory.Command.Hero.HeroFactory;
import Command.ConcreteCommand.AddHero;
import Command.HistoryCommand;
import Player.PlayerManager;
import Hero.Hero;

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
            throw new IllegalArgumentException("The hero information is not in the correct format!,You must input like \"id,name\"");
        }
        String heroID = heroInfoArray[0];
        String heroName = heroInfoArray[1];


        int count1 =  heroID.replace(" ", "").length();
        int count2 =  heroName.replace(" ", "").length();
        if(count1 ==  0 || count2 == 0){
            throw new IllegalArgumentException("The hero information is not in the correct format!,You must input like \"id,name\"");
        }
        
        System.out.print("Hero Type (1 = Warrior | 2 = Warlock ):-");
        String heroChoose = scanner.nextLine();
        if(heroChoose.equals("")){
            throw new IllegalArgumentException("The hero type is wrong!");
        }
    
        HeroFactory heroFactory = new HeroFactory();
        Hero hero =  heroFactory.CreateHero(heroID, heroName,heroChoose);
        return new AddHero(playerManager, historyCommand, hero);

  


    
}
}