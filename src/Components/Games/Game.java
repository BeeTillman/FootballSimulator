package Components.Games;

import Components.Games.Stats.GameStats;
import Components.Teams.Team;

public class Game {
    private int gameID;
    private Team homeTeam;
    private Team awayTeam;
    private GameStats gameStats;
    private int driveNumber;

    public Game(int gameID, Team homeTeam, Team awayTeam) {
        this.gameID = gameID;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.gameStats = new GameStats();
    }

    public void startGame() throws InterruptedException {
        System.out.println("This is a game between " + homeTeam.getTeamName() + " and " + awayTeam.getTeamName() + ".");
        Thread.sleep(1000);
        coinToss coinToss = new coinToss(homeTeam, awayTeam);
        Team firstTeam = coinToss.coinToss();
        Team secondTeam;
        if (firstTeam == homeTeam){
            secondTeam = awayTeam;
        }
        else {
            secondTeam = homeTeam;
        }
        System.out.println(firstTeam.getTeamName() + " will receive the ball first.");
        System.out.println();
        Thread.sleep(1000);
        System.out.println("The game has started!");
        System.out.println();
        Thread.sleep(1000);
        System.out.println("Drive " + driveNumber + ":");
        System.out.println();
        Thread.sleep(1000);
    }

    public int getGameID() {
        return gameID;
    }
    public Team getHomeTeam() {
        return homeTeam;
    }
    public Team getAwayTeam() {
        return awayTeam;
    }
    public void incrementDriveNumber(){
        driveNumber++;
    }

}
