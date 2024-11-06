import java.util.HashMap;
import java.util.Scanner;

import Command.Command;
import Command.HistoryCommand;
import Factory.Command.CommandFactory;
import Factory.Command.ConcreteFactory.*;

import Player.PlayerManager;


public class Main {
    public static void main(String[] args) {
        HashMap<String, CommandFactory> cmdFactoryMap = new HashMap<String, CommandFactory>();
        HistoryCommand historyCommand = new HistoryCommand();
        PlayerManager playerManager = new PlayerManager();

        // Command Map
        cmdFactoryMap.put("CP", new CreatePlayerFactory(playerManager, historyCommand));
        cmdFactoryMap.put("AF", new AddHeroFactory(playerManager, historyCommand));
        cmdFactoryMap.put("RH", new RemoveHeroFactory(playerManager,historyCommand));
        cmdFactoryMap.put("CHS", new CallHeroSkillFactory(playerManager,historyCommand));
        cmdFactoryMap.put("SPD", new ShowPlayerDetailFactory(playerManager));
        cmdFactoryMap.put("CPN", new ChangePlayerNameFactory(playerManager,historyCommand));
        cmdFactoryMap.put("SAP", new ShowAllPlayersFactory(playerManager));
        cmdFactoryMap.put("SCP", new SetCurrentPlayerFactory(playerManager));
        cmdFactoryMap.put("ULC", new UndoLastCommandFactory(historyCommand));
        cmdFactoryMap.put("RLC", new RedoLastCommandFactory(playerManager,historyCommand));
        cmdFactoryMap.put("SURL", new ShowUndoRedoListFactory(historyCommand));
        cmdFactoryMap.put("EXIT", new ExitFactory());


        String command;
        while (true) {
            System.out.print("----------------------------------------------------------------------------------\n");
            String message = "Command list: ";
            for (String i : cmdFactoryMap.keySet()) {
                String cmdName = cmdFactoryMap.get(i).getClass().getName();
                cmdName = cmdName.substring(cmdName.lastIndexOf(".") + 1);
                // Remove "Factory" from the end of the class name to make it more readable
                if (cmdName.endsWith("Factory")) {
                    cmdName = cmdName.substring(0, cmdName.length() - "Factory".length());
                }
                message += i + ": " + cmdName + "  ";
            }
            System.out.println(message);
            System.out.print(playerManager.getCurPlayDetail());
            System.out.print("Please input command:");
            // read user input
  
            Scanner scanner = new Scanner(System.in);
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
                System.out.print(e.getMessage() + " Invalid command!(Main 63)");
            }

        }

    }
}
