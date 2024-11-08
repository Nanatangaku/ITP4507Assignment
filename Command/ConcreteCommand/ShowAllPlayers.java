package Command.ConcreteCommand;



import Command.Command;
import Command.PlayerManagerCommand;
import Player.Player;
import Player.PlayerManager;


public class ShowAllPlayers extends PlayerManagerCommand {

        

        public ShowAllPlayers(PlayerManager playerManager) {
            super(playerManager);
        }

        public void execute() {
              System.out.print(playerManager.getPlayer());
        }
        public String toString(){
            return "Command:Show All Players";
    
        }

}
