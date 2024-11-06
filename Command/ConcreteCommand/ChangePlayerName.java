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
    playerMemento = new PlayerMemento(player);
    playerManager.changeName(player);
    // System.out.print("after name : " + player.getPlayerName());

  }

  public void undo() {

    playerMemento.restore();
  }

}
