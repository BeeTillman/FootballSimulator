package Components.Coaches.Stats;

public class CoachStats {
    private BaseStats baseStats = new BaseStats();
    private PlayoffStats playoffStats = new PlayoffStats();

    // Getters and Setters
    public int getStat(StatTypes statType){
        return switch (statType) {
            case Wins -> this.baseStats.getStat(statType);
            case Losses -> this.baseStats.getStat(statType);
            case Ties -> this.baseStats.getStat(statType);
            case Championships -> this.baseStats.getStat(statType);
            case PlayoffWins -> this.playoffStats.getStat(statType);
            case PlayoffLosses -> this.playoffStats.getStat(statType);
            case PlayoffTies -> this.playoffStats.getStat(statType);
            default -> 0;
        };
    }
}
