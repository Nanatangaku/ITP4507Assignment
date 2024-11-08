package Player;
import java.util.HashMap;

import java.util.Scanner;

public class PlayerManager {
    
    private String curPlayerID = "";
    private HashMap<String,Player> Players;
   Scanner scanner;
    public PlayerManager(Scanner scanner){
        Players = new HashMap<String,Player>();
        this.scanner = scanner;

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
        //if players != 0, when create new player, set it to current player
        if(Players.size() != 0){
            curPlayerID = player.getPlayerID();
        }

    }

    public Player getCurPlayer(){
        if(!Players.containsKey(curPlayerID)){
            System.out.println("Player ID does not exist");
            return null;
    }
        //return the curplayer's hero list
        return Players.get(curPlayerID);
    }
    public String getCurPlayerID(){
        return curPlayerID;
    }
    public String getCurPlayDetail(){


        if(!Players.containsKey(curPlayerID)){
            return "";
        }
        return "The Current Player is ID: " + Players.get(curPlayerID).getPlayerID() + " Name: " + Players.get(curPlayerID).getPlayerName()+"\n";


    }
    public String getPlayer(){
        String PlayerList = "";
        for(HashMap.Entry<String,Player> entry : Players.entrySet()){
            PlayerList += "Player ID: " + entry.getKey() + ", Player Name: " + entry.getValue().getPlayerName() + "\n";
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


    public boolean changeName(Player player){
        //ask user to input new player name
      
        System.out.print("Please input new name of the current player:-");
        String newName = scanner.nextLine();
        if(newName != "" || newName != null){
            player.setPlayerName(newName);
            System.out.print("Player’s name is updated.");
            return true;
        }else{
            System.out.println("Player Name cannot be null");
            return false;
        }
       
        
    }

    public Player getChangePlayerName(){
        //ask user to input player ID
        
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