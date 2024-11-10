package Command.ConcreteCommand;



import Command.CanUndoCommand;
import Command.HistoryCommand;
import Player.PlayerManager;
import Player.PlayerMemento;
import Player.Player;

public class ChangePlayerName extends CanUndoCommand {
  PlayerMemento playerMemento;
  Player player;
  String newName;

  public ChangePlayerName(PlayerManager playerManager, HistoryCommand historyCommand,Player player,String newName) {
    super(playerManager, historyCommand);
    if(player==null){
      throw new IllegalArgumentException("Player cannot be null");
    }else{
      this.player=player;
      this.newName = newName;
    }
  }

  public void nowExecute() {
    playerMemento = new PlayerMemento(player);
    player.setPlayerName(newName);
    

  }

  public void undo() {
    playerMemento.restore();
  }
  public String toString(){
    return "Command:Change Player Name";
  }

}
