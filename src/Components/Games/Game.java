package Components.Games;

import Components.Games.Stats.GameStats;
import Components.Teams.Team;

public class Game {
    private int gameID;
    private Team homeTeam;
    private Team awayTeam;
    private GameStats gameStats;

    public Game(int gameID, Team homeTeam, Team awayTeam, GameStats gameStats) {
        this.gameID = gameID;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.gameStats = gameStats;
    }
}
