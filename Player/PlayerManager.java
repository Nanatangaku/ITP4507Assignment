package Player;
import java.util.HashMap;
import Player.Player;
import java.util.Scanner;
public class PlayerManager {
    private String curPlayerID = "";
    private HashMap<String,Player> Players;
    public PlayerManager(){
        Players = new HashMap<String,Player>();

    }
    public void addPlayer(Player player){
        if(player.getPlayerID() == null){
            System.out.println("Player ID cannot be null");
            return;
        }else if(Players.containsKey(player.getPlayerID())){
            System.out.println("Player ID already exist");
            return;
        }else{
            Players.put(player.getPlayerID(),player);
        }
        curPlayerID = player.getPlayerID();
    }

    public Player getCurPlayer(){
        if(!Players.containsKey(curPlayerID)){
            System.out.println("Player ID does not exist");
            return null;
    }
    return Players.get(curPlayerID);
    }
    public String getCurPlayerID(){
        return curPlayerID;
    }

    public String getPlayer(){
        String PlayerList = "";
        for(HashMap.Entry<String,Player> entry : Players.entrySet()){
            PlayerList += "Player ID: " + entry.getKey() + " Player Name: " + entry.getValue().getPlayerName() + "\n";
        }
        return PlayerList;
    }

    public void setCurPlayer(String playerID){
        if(Players.containsKey(playerID)){
            curPlayerID = playerID;
        }else{
            System.out.println("Player ID does not exist");
        }
    }

    public void removePlayer(Player player){
        if(Players.containsValue(player)){
            Players.values().remove(player);
        }else{
            System.out.println("Player does not exist");
        }
    }


    public void changeName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the player ID You want to change name : ");
        String playerID = scanner.nextLine();
        if(Players.containsKey(playerID)){
            System.out.println("Enter the new name : ");
            String newName = scanner.nextLine();
            Players.get(playerID).setPlayerName(newName);
        }else{
            System.out.println("Player ID does not exist");
        }
    }

    
}
