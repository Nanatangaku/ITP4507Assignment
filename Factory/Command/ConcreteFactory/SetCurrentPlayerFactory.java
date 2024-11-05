package Factory.Command.ConcreteFactory;


import Command.Command;
import Factory.Command.CommandFactory;
import Command.ConcreteCommand.SetCurrentPlayer;

public class SetCurrentPlayerFactory extends CommandFactory {

    public Command createCommand() {
        return new SetCurrentPlayer();
    }
    
}
