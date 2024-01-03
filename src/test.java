import Components.Games.Game;
import Components.Players.Player;
import Components.Players.Position;
import Components.Players.PositionedPlayers.OffensivePlayer;
import Components.Teams.Team;

public class test {
    public static void main(String[] args) throws InterruptedException {
        Team team1 = new Team();
        Team team2 = new Team();
        Game game = new Game(1, team1, team2);
        game.startGame();
    }
}
