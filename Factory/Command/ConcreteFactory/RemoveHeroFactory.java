package Factory.Command.ConcreteFactory;

import java.util.Scanner;


import Command.Command;
import Factory.Command.CanUndoCommandFactory;

import Player.PlayerManager;
import Command.ConcreteCommand.RemoveHero;
import Command.HistoryCommand;


public class RemoveHeroFactory extends CanUndoCommandFactory {
    Scanner scanner;

    public RemoveHeroFactory(PlayerManager playerManager,Scanner scanner,HistoryCommand historyCommand) {
        super(playerManager,scanner,historyCommand);
        this.scanner = scanner;
    }
    
    public Command createCommand() {
        System.out.println("Please input the hero id you want to remove: ");

                String heroId = scanner.nextLine();
        return new RemoveHero(playerManager,historyCommand,heroId);
    }


}
