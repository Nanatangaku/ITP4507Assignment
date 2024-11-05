package Factory.Command.ConcreteFactory;

import Command.Command;
import Factory.Command.CommandFactory;
import Command.ConcreteCommand.AddHero;

public class AddHeroFactory extends CommandFactory {
    public Command createCommand() {
        return new AddHero();
    }
    
}
