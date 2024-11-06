package Command.ConcreteCommand;
import Command.CanUndoCommand;
import Player.PlayerManager;
import Command.HistoryCommand;
import Hero.Hero;
public class AddHero extends CanUndoCommand{
    private Hero hero;
    public AddHero(PlayerManager playerManager,HistoryCommand historyCommand,Hero hero) {
        super(playerManager, historyCommand);
        this.hero = hero;
    }

    public void nowExecute(){

        //get the current Player and add the hero to the player
        playerManager.getCurPlayer().addHero(hero);
        System.out.print(playerManager.getCurPlayer().getHeroes().get(0).getHeroName());
        
      
    }
    public void undo(){

    }
}
