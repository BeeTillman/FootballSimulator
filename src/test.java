import Components.Players.Player;
import Components.Players.Position;
import Components.Players.PositionedPlayers.OffensivePlayer;
import Components.Teams.Team;

public class test {
    public static void main(String[] args){
        Team teamOne = new Team();
        teamOne.generatePlayers();
        System.out.println(teamOne);
    }
}
