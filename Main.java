import java.util.HashMap;

import Command.Command;

import Factory.Command.CommandFactory;
import Factory.Command.ConcreteFactory.*;
public class Main{
    public static void Main(String args[]){
        HashMap<String,CommandFactory>cmdFactoryMap = new HashMap<String,CommandFactory>();
        // 1.	Create a Player.
        // 2.	Add a hero (Warrior or Warlock) to the current player.
        // 3.	Remove a hero from the current player.
        // 4.	Select a player by using a player ID.
        // 5.	Call a hero's skill by a hero ID.
        // 6.	Show the detail information of current player.
        // 7.	Change the player's name of the current player.
        // 8.	Show all players.
        // 9.	Set current player.
        // 10.	Undo last command.
        // 11.	Redo the last undone command.
        // 12.	Show undo/redo list.
        // 13.	Exit System.
        cmdFactoryMap.put("0", new CreatePlayerFactory());
        cmdFactoryMap.put("1", new AddHeroFactory());
        cmdFactoryMap.put("2", new RemoveHeroFactory());
        cmdFactoryMap.put("3", new SelectPlayerFactory());
        cmdFactoryMap.put("4", new CallHeroSkillFactory());
        cmdFactoryMap.put("5", new ShowPlayerDetailFactory());
        cmdFactoryMap.put("6", new ChangePlayerNameFactory());
        cmdFactoryMap.put("7", new ShowAllPlayersFactory());
        cmdFactoryMap.put("8", new SetCurrentPlayerFactory());
        cmdFactoryMap.put("9", new UndoLastCommandFactory());
        cmdFactoryMap.put("10", new RedoLastCommandFactory());
        cmdFactoryMap.put("11", new ShowUndoRedoListFactory());
        cmdFactoryMap.put("12", new ShowUndoRedoListFactory());
        
        String command;
        while(true){
            System.out.print("-------------------------------------------------");
            String message = "command list \n";
            for(String i : cmdFactoryMap.keySet()){
                String cmdName = cmdFactoryMap.get(i).getClass().getName();
                cmdName = cmdName.substring(cmdName.lastIndexOf(".") + 1);
                cmdName = cmdName.substring(0, cmdName.length() - 7);
                message += i + ":" + cmdName + "  ";
                
            }
        }

        

    }
}
