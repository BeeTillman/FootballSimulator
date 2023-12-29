import Components.Players.Player;
import Components.Players.Position;
import Components.Players.PositionedPlayers.OffensivePlayer;

public class test {
    public static void main(String[] args){
        Player player = new OffensivePlayer(Position.QB);
        System.out.println(player);
    }
}
