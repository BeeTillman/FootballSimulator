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

    // Adjust Stats

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

    @Override
    public String toString() {
        return "PlayerStats{" +
                "Passing Yards=" + yardsPassing +
                ", Rushing Yards=" + yardsRushing +
                ", Receiving Yards=" + yardsReceiving +
                ", Passing TDs=" + tdPassing +
                ", Rushing TDs=" + tdRushing +
                ", Receiving TDs=" + tdReceiving +
                ", Tackles=" + tackles +
                ", Tackles For Loss=" + tacklesForLoss +
                ", Sacks=" + sacks +
                ", Interceptions=" + interceptions +
                '}';
    }

    // Getters and Setters

    public int getYardsPassing() {
        return yardsPassing;
    }

    public void setYardsPassing(int yardsPassing) {
        this.yardsPassing = yardsPassing;
    }

    public int getYardsRushing() {
        return yardsRushing;
    }

    public void setYardsRushing(int yardsRushing) {
        this.yardsRushing = yardsRushing;
    }

    public int getYardsReceiving() {
        return yardsReceiving;
    }

    public void setYardsReceiving(int yardsReceiving) {
        this.yardsReceiving = yardsReceiving;
    }

    public int getTdPassing() {
        return tdPassing;
    }

    public void setTdPassing(int tdPassing) {
        this.tdPassing = tdPassing;
    }

    public int getTdRushing() {
        return tdRushing;
    }

    public void setTdRushing(int tdRushing) {
        this.tdRushing = tdRushing;
    }

    public int getTdReceiving() {
        return tdReceiving;
    }

    public void setTdReceiving(int tdReceiving) {
        this.tdReceiving = tdReceiving;
    }

    public int getTackles() {
        return tackles;
    }

    public void setTackles(int tackles) {
        this.tackles = tackles;
    }

    public int getTacklesForLoss() {
        return tacklesForLoss;
    }

    public void setTacklesForLoss(int tacklesForLoss) {
        this.tacklesForLoss = tacklesForLoss;
    }

    public int getSacks() {
        return sacks;
    }

    public void setSacks(int sacks) {
        this.sacks = sacks;
    }

    public int getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }
}
