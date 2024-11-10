package Factory.Command.Player;

import Player.Player;

public class PlayerFactory {

    public Player createPlayer(String playID, String playerName) {
        if(playID == null || playerName == null || playID.isEmpty() || playerName.isEmpty()){
            throw new IllegalArgumentException("Player ID and Player Name cannot be null or empty");
        }
        return new Player(playID, playerName);
    }
    
}
