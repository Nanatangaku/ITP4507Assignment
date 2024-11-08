import java.util.HashMap;
import java.util.Scanner;

import Command.Command;
import Command.HistoryCommand;
import Factory.Command.CommandFactory;
import Factory.Command.ConcreteFactory.*;
import InputOutput.inputOutput;
import Player.PlayerManager;


public class Main {
   
    public static void main(String[] args) {
        Scanner scanner = inputOutput.scanner;
        HashMap<String, CommandFactory> cmdFactoryMap = new HashMap<String, CommandFactory>();
        HistoryCommand historyCommand = new HistoryCommand();
        PlayerManager playerManager = new PlayerManager(scanner);
     
       
        // Command Map
        cmdFactoryMap.put("c", new CreatePlayerFactory(playerManager, scanner,historyCommand));
        cmdFactoryMap.put("a", new AddHeroFactory(playerManager, historyCommand,scanner));
        cmdFactoryMap.put("d", new RemoveHeroFactory(playerManager,scanner,historyCommand));
        cmdFactoryMap.put("m", new CallHeroSkillFactory(playerManager,historyCommand,scanner));
        cmdFactoryMap.put("s", new ShowPlayerDetailFactory(playerManager,scanner));
        cmdFactoryMap.put("t", new ChangePlayerNameFactory(playerManager,scanner,historyCommand));
        cmdFactoryMap.put("p", new ShowAllPlayersFactory(playerManager,scanner));
        cmdFactoryMap.put("g", new SetCurrentPlayerFactory(playerManager,scanner));
        cmdFactoryMap.put("u", new UndoLastCommandFactory(historyCommand,scanner));
        cmdFactoryMap.put("r", new RedoLastCommandFactory(playerManager,scanner,historyCommand));
        cmdFactoryMap.put("l", new ShowUndoRedoListFactory(historyCommand,scanner));
        cmdFactoryMap.put("x", new ExitFactory(scanner));
 
       
        String command;
        while (true) {
            // System.out.println();
            // String message = "Command list: ";
            // for (String i : cmdFactoryMap.keySet()) {
            //     String cmdName = cmdFactoryMap.get(i).getClass().getName();
            //     cmdName = cmdName.substring(cmdName.lastIndexOf(".") + 1);
            //     // Remove "Factory" from the end of the class name to make it more readable
            //     if (cmdName.endsWith("Factory")) {
            //         cmdName = cmdName.substring(0, cmdName.length() - "Factory".length());
            //     }
            //     message += i + ": " + cmdName + "  ";
            // }
            // System.out.println(message);
            // System.out.print(playerManager.getCurPlayDetail());
            // System.out.print("Please input command:");
            // read user input



            System.out.println();
            System.out.println("Fantastic World (FW)");
            System.out.println("c = create player, g = set current player, a = add hero, m = call hero skill, d = delete hero, s = show player, p = display all players, t = change player’s name, u = undo, r = redo, l = list undo/redo, x = exit system");
            System.out.print( playerManager.getCurPlayDetail());
            System.out.print("Please enter command [ c | g | a | m | d | s | p | t | u | r | l | x ] :-");

            command = scanner.nextLine();
            if (!cmdFactoryMap.containsKey(command)) {
                System.out.print("Invalid command!(Main 53)");
                continue;
            }
            // execute command
            try {
                Command cmd = cmdFactoryMap.get(command).createCommand();
                if (command == null)
                    continue;
                cmd.execute();
            } catch (Exception e) {
                // System.out.print(e.getMessage() + " Invalid command!(Main 63)");
            }

        }

    }
}
