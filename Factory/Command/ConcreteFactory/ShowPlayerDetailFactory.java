package Factory.Command.ConcreteFactory;

import Command.Command;
import Factory.Command.CommandFactory;
import Command.ConcreteCommand.ShowPlayerDetail;

public class ShowPlayerDetailFactory extends CommandFactory {

    public Command createCommand() {
        return new ShowPlayerDetail();
    }
    
}
