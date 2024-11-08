package Factory.Command.ConcreteFactory;

import java.util.Scanner;

import Command.Command;
import Factory.Command.CommandFactory;
import Command.ConcreteCommand.ExitCommand;

public class ExitFactory extends CommandFactory {
    public ExitFactory(Scanner scanner) {
        super(scanner);
    }

    public Command createCommand() {
   
        return new ExitCommand();
    }
    
}
