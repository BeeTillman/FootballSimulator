package Components.Teams;

import Components.Players.Player;

public class Team {
    private Player[] players = new Player[53];

    public Team(){
        for (int i = 0; i < players.length; i++){
            players[i] = new Player();
        }
    }
}
