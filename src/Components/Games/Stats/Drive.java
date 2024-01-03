package Components.Games.Stats;

import Components.Teams.Team;

public class Drive {
    private Team offenseTeam;
    private Team defenseTeam;
    private int currentDown;
    private int yardsToGo;
    private int yardLine;

    public Drive(Team offenseTeam, Team defenseTeam, int yardLine) {
        this.offenseTeam = offenseTeam;
        this.defenseTeam = defenseTeam;
        this.currentDown = 1;
        this.yardsToGo = 10;
        this.yardLine = yardLine;
    }

    public void playDown(){
        int yardsGained = getYardsGained(currentDown); // Get yards gained on play
        if (yardsGained >= yardsToGo){ // If yards gained is greater than yards to go, reset down to 1st and 10
            resetDown();
        }
        else { // Else, increment down and subtract yards gained from yards to go
            currentDown = currentDown + 1;
            yardsToGo = yardsToGo - yardsGained;
        }
        calculateYardLine(yardsGained);
    }

    /**
     * @return the number of yards gained on the play
     * @param currentDown the current down of the current drive
     *
     * This method will be used to calculate the yards gained on a play
     * depending on the current down of the drive, the yard line, and the
     * offensive and defensive teams ratings.
     */
    public int getYardsGained(int currentDown){
        return 0;
    }
    public void resetDown(){
        currentDown = 1;
        yardsToGo = 10;
    }
    public void calculateYardLine(int yardsGained){
        if (yardLine + yardsGained > 50){
            yardLine = yardLine - yardsGained;
        }
        else {
            yardLine = yardLine + yardsGained;
        }
    }
}
