package Components.Games;

import Components.Teams.Team;

public class coinToss {
    private Team team1;
    private Team team2;
    public coinToss(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }
    public int getCoinTossInt(){
        return (int) (Math.random() * 2);
    }
    public String getCoinTossResultAsString(int coinToss){
        if (coinToss == 0){
            return "Heads";
        }
        else {
            return "Tails";
        }
    }
    public Team getTeamFromCoinToss(int coinToss){
        if (coinToss == 0){
            return team1;
        }
        else {
            return team2;
        }
    }
    public Team coinToss(){
        System.out.println("Coin Toss...");
        System.out.println(team1.getTeamName() + " chooses heads.");
        int coinToss = getCoinTossInt();
        System.out.println("The result is " + getCoinTossResultAsString(coinToss));
        System.out.println();
        return getTeamFromCoinToss(coinToss);
    }
}
