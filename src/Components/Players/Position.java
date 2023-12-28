package Components.Players;

public enum Position {
    // Offense
    QB(PositionSide.Offense), // Quarterback
    RB(PositionSide.Offense), // Runningback
    FB(PositionSide.Offense), // Fullback
    WR(PositionSide.Offense), // Wide Receiver
    TE(PositionSide.Offense), // Tight End
    OL(PositionSide.Offense), // Offensive Line
    // Defense
    CB(PositionSide.Defense), // Cornerback
    SS(PositionSide.Defense), // Strong Safety
    FS(PositionSide.Defense), // Free Safety
    MLB(PositionSide.Defense), // Middle Linebacker
    OLB(PositionSide.Defense), // Outside Linebacker
    DE(PositionSide.Defense), // Defensive End
    DT(PositionSide.Defense); // Defensive Tackle

    private final PositionSide side;

    private Position (PositionSide side){
        this.side = side;
    }

    public PositionSide getSide(){
        return side;
    }
}
