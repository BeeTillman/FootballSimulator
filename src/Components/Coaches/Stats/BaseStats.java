package Components.Coaches.Stats;

public class BaseStats {
    private int wins;
    private int losses;
    private int ties;
    private int championships;

    public BaseStats() {
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
        this.championships = 0;
    }

    // Getters and Setters
    public int getStat(StatTypes statType){
        return switch (statType) {
            case Wins -> this.wins;
            case Losses -> this.losses;
            case Ties -> this.ties;
            case Championships -> this.championships;
            default -> 0;
        };

    }

    public void setStat(StatTypes statType, int value){
        switch (statType) {
            case Wins -> this.wins = value;
            case Losses -> this.losses = value;
            case Ties -> this.ties = value;
            case Championships -> this.championships = value;
        };
    }

    public void incrementStat(StatTypes statType){
        switch (statType) {
            case Wins -> this.wins++;
            case Losses -> this.losses++;
            case Ties -> this.ties++;
            case Championships -> this.championships++;
        };
    }

    public void decrementStat(StatTypes statType){
        switch (statType) {
            case Wins -> this.wins--;
            case Losses -> this.losses--;
            case Ties -> this.ties--;
            case Championships -> this.championships--;
        };
    }
}
