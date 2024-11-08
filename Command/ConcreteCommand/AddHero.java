package Command.ConcreteCommand;
import Command.CanUndoCommand;
import Player.PlayerManager;
import Command.HistoryCommand;
import Hero.Hero;
public class AddHero extends CanUndoCommand{
    private Hero hero;
    public AddHero(PlayerManager playerManager,HistoryCommand historyCommand,Hero hero) {
        super(playerManager, historyCommand);
        if(hero == null){
            return;
        }else{
            this.hero = hero;
        }
    }

    public void nowExecute(){

        //get the current Player and add the hero to the player
        playerManager.getCurPlayer().addHero(hero);
     
        
      
    }
    public void undo(){
        playerManager.getCurPlayer().removeHero(hero);
    }

    public String toString(){
        return "Command:Add Hero";
    }
}
