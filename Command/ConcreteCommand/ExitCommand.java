package Command.ConcreteCommand;

import Command.Command;

public class ExitCommand extends Command{
    public void execute(){
        System.out.println("Exiting the game...");
        System.exit(0);
    }
}
