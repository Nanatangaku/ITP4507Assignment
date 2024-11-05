import java.util.HashMap;
import java.util.Scanner;
import Command.Command;
import Command.HistoryCommand;
import Factory.Command.CommandFactory;
import Factory.Command.ConcreteFactory.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, CommandFactory> cmdFactoryMap = new HashMap<String, CommandFactory>();
        HistoryCommand historyCommand = new HistoryCommand();

        // Command Map
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
 

        String command;
        while (true) {
            System.out.print("-------------------------------------------------\n");
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
            System.out.print(message);

            System.out.print("Please input command:");
            // read user input
            Scanner scanner = new Scanner(System.in);
            command = scanner.nextLine();
            if (!cmdFactoryMap.containsKey(command)) {
                System.out.print("Invalid command!");
                continue;
            }
            // execute command
            try {
                Command cmd = cmdFactoryMap.get(command).createCommand();
                if (command == null)
                    continue;
                cmd.execute();
            } catch (Exception e) {
                System.out.print(e.getMessage() + "Invalid command!");
            }

        }

    }
}
