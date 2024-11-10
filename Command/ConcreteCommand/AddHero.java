package Command.ConcreteCommand;
import Command.CanUndoCommand;
import Player.PlayerManager;
import Command.HistoryCommand;
import Hero.Hero;
import Player.Player;
public class AddHero extends CanUndoCommand{
    private Hero hero;
    private String curPlayerID;
   
    public AddHero(PlayerManager playerManager,HistoryCommand historyCommand,Hero hero) {
        super(playerManager, historyCommand);
        if(hero == null){
            System.out.println("Wrong Input in AddHero");
            return;
        }else{
            System.out.print("Hero ID: "+hero.getHeroID()+ " Hero Name: "+hero.getHeroName()+"is created" );
            this.hero = hero;
        }
        curPlayerID = playerManager.getCurPlayerID();
    }

    public void nowExecute(){
   
        Player player = playerManager.getPlayerByID(curPlayerID);
        player.addHero(hero);
     
        
      
    }
    public void undo(){
        Player player = playerManager.getPlayerByID(curPlayerID);
        player.removeHero(hero);
    }

    public String toString(){
        return "Command:Add Hero";
    }
}
