package Factory.Command.ConcreteFactory;

import Command.Command;
import Factory.Command.CommandFactory;
import Command.ConcreteCommand.CallHeroSkill;

public class CallHeroSkillFactory extends CommandFactory {
    public Command createCommand() {
        return new CallHeroSkill();
    }
    
}
