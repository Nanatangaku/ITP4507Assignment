package Command.ConcreteCommand;

import java.util.Scanner;

import Command.CanUndoCommand;
import Command.HistoryCommand;
import Player.PlayerManager;
import Player.PlayerMemento;
import Player.Player;

public class ChangePlayerName extends CanUndoCommand {
  PlayerMemento playerMemento;

  public ChangePlayerName(PlayerManager playerManager, HistoryCommand historyCommand) {
    super(playerManager, historyCommand);
  }

  public void nowExecute() {
    Player player = playerManager.getChangePlayerName();
    // System.out.print("before name : " + player.getPlayerName());
    
    if(playerManager.changeName(player)==true){
      playerMemento = new PlayerMemento(player);
    }
    // System.out.print("after name : " + player.getPlayerName());
    

  }

  public void undo() {
    playerMemento.restore();
  }
  public String toString(){
    return "Command:Change Player Name";
  }

}
