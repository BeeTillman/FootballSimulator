package Components.Coaches.Stats;

public class PlayoffStats {
    private int wins;
    private int losses;
    private int ties;

    public PlayoffStats() {
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
    }

    // Getters and Setters
    public int getStat(StatTypes statType){
        return switch (statType) {
            case PlayoffWins -> this.wins;
            case PlayoffLosses -> this.losses;
            case PlayoffTies -> this.ties;
            default -> 0;
        };
    }

    public void setStat(StatTypes statType, int value){
        switch (statType) {
            case PlayoffWins -> this.wins = value;
            case PlayoffLosses -> this.losses = value;
            case PlayoffTies -> this.ties = value;
        };
    }

    public void incrementStat(StatTypes statType){
        switch (statType) {
            case PlayoffWins -> this.wins++;
            case PlayoffLosses -> this.losses++;
            case PlayoffTies -> this.ties++;
        };
    }

    public void decrementStat(StatTypes statType){
        switch (statType) {
            case PlayoffWins -> this.wins--;
            case PlayoffLosses -> this.losses--;
            case PlayoffTies -> this.ties--;
        };
    }

}
