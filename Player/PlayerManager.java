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
        }
        //if players size is 0, put the player and set it as current player
        else if( Players.size() == 0){
            //put the player and set it as current player
            Players.put(player.getPlayerID(),player);
            curPlayerID = player.getPlayerID();
        }
        
        
        
        else{
            Players.put(player.getPlayerID(),player);
        }

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
    public String getCurPlayDetail(){


        if(!Players.containsKey(curPlayerID)){
            return "";
        }
        return "Current Player:\nID :" + Players.get(curPlayerID).getPlayerID() + " Name:" + Players.get(curPlayerID).getPlayerName()+"\n";


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


    public void changeName(Player player){
        //ask user to input new player name
        Scanner scanner = new Scanner(System.in);
        System.out.print("New Player Name:");
        String newName = scanner.nextLine();
        player.setPlayerName(newName);
    
    }

    public Player getChangePlayerName(){
        //ask user to input player ID
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player ID:");
        String playerID = scanner.nextLine();
        //check if player ID exist
        if(Players.containsKey(playerID)){
            return Players.get(playerID);
        }else{
            System.out.println("Player ID does not exist");
            return null;
        }


    }
}