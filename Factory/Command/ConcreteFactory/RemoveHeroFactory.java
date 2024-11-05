package Factory.Command.ConcreteFactory;

import Command.Command;
import Factory.Command.CommandFactory;
import Command.ConcreteCommand.RemoveHero;


public class RemoveHeroFactory extends CommandFactory {
    
    public Command createCommand() {
        return new RemoveHero();
    }


}
