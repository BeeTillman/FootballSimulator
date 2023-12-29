package Components.Players;

public class PlayerStats {
    private int yardsPassing;
    private int yardsRushing;
    private int yardsReceiving;
    private int tdPassing;
    private int tdRushing;
    private int tdReceiving;
    private int tackles;
    private int tacklesForLoss;
    private int sacks;
    private int interceptions;

    // Default Constructor
    public PlayerStats() {
        this.yardsPassing = 0;
        this.yardsRushing = 0;
        this.yardsReceiving = 0;
        this.tdPassing = 0;
        this.tdRushing = 0;
        this.tdReceiving = 0;
        this.tackles = 0;
        this.tacklesForLoss = 0;
        this.sacks = 0;
        this.interceptions = 0;
    }
    
    // Copy Constructor
    public PlayerStats(PlayerStats playerStats){
        this.yardsPassing = playerStats.yardsPassing;
        this.yardsRushing = playerStats.yardsRushing;
        this.yardsReceiving = playerStats.yardsReceiving;
        this.tdPassing = playerStats.tdPassing;
        this.tdRushing = playerStats.tdRushing;
        this.tdReceiving = playerStats.tdReceiving;
        this.tackles = playerStats.tackles;
        this.tacklesForLoss = playerStats.tacklesForLoss;
        this.sacks = playerStats.sacks;
        this.interceptions = playerStats.interceptions;
    }

    // Adjust , Get , and Set Stats

    public void adjStat(StatTypes type, int delta){
        switch (type){
            case PassingTDs -> this.tdPassing += delta;
            case PassingYards -> this.yardsPassing += delta;
            case RushingTDs -> this.tdRushing += delta;
            case RushingYards -> this.yardsRushing += delta;
            case ReceivingTds -> this.tdReceiving += delta;
            case ReceivingYards -> this.yardsReceiving += delta;
            case Tackles -> this.tackles += delta;
            case TacklesForLoss -> this.tacklesForLoss += delta;
            case Sacks -> this.sacks += delta;
            case Interceptions -> this.interceptions += delta;
        }
    }

    public int getStat(StatTypes type){
        switch (type){
            case PassingTDs -> { return this.tdPassing; }
            case PassingYards -> { return this.yardsPassing; }
            case RushingTDs -> { return this.tdRushing; }
            case RushingYards -> { return this.yardsRushing; }
            case ReceivingTds -> { return this.tdReceiving; }
            case ReceivingYards -> { return this.yardsReceiving; }
            case Tackles -> { return this.tackles; }
            case TacklesForLoss -> { return this.tacklesForLoss; }
            case Sacks -> { return this.sacks; }
            case Interceptions -> { return this.interceptions; }
        }
        return 0;
    }

    public void setStat(StatTypes type, int value){
        switch (type){
            case PassingTDs -> { this.tdPassing = value; }
            case PassingYards -> { this.yardsPassing = value; }
            case RushingTDs -> { this.tdRushing = value; }
            case RushingYards -> { this.yardsRushing = value; }
            case ReceivingTds -> { this.tdReceiving = value; }
            case ReceivingYards -> { this.yardsReceiving = value; }
            case Tackles -> { this.tackles = value; }
            case TacklesForLoss -> { this.tacklesForLoss = value; }
            case Sacks -> { this.sacks = value; }
            case Interceptions -> { this.interceptions = value; }
        }
    }

    @Override
    public String toString() {
        return
                "Passing Yards: " + yardsPassing + "\n" +
                "Rushing Yards: " + yardsRushing + "\n" +
                "Receiving Yards: " + yardsReceiving + "\n" +
                "Passing TDs: " + tdPassing + "\n" +
                "Rushing TDs: " + tdRushing + "\n" +
                "Receiving TDs: " + tdReceiving + "\n" +
                "Tackles: " + tackles + "\n" +
                "Tackles For Loss: " + tacklesForLoss + "\n" +
                "Sacks: " + sacks + "\n" +
                "Interceptions: " + interceptions + "\n";
    }

}
