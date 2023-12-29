package Components.Players;

public enum Position {
    // Offense
    QB(PositionSide.Offense), // Quarterback
    RB(PositionSide.Offense), // Runningback
    FB(PositionSide.Offense), // Fullback
    WR(PositionSide.Offense), // Wide Receiver
    TE(PositionSide.Offense), // Tight End
    OT(PositionSide.Offense), // Offensive Line
    OG(PositionSide.Offense), // Offensive Line
    C(PositionSide.Offense), // Offensive Line

    // Special Teams
    K(PositionSide.SpecialTeams), // Kicker
    P(PositionSide.SpecialTeams), // Punter
    LS(PositionSide.SpecialTeams), // Long Snapper

    // Defense
    CB(PositionSide.Defense), // Cornerback
    S(PositionSide.Defense), // Strong Safety
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
