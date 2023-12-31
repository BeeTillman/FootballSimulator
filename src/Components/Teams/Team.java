package Components.Teams;

import Components.Players.Player;
import Components.Players.Position;
import Components.Players.PositionedPlayers.DefensivePlayer;
import Components.Players.PositionedPlayers.OffensivePlayer;
import Components.Players.PositionedPlayers.SpecialTeamsPlayer;
import Components.Players.RandomDataGenerator;

import java.util.Arrays;
import java.util.Comparator;

public class Team {

    private String teamCity;
    private String teamMascot;

    private int numQBs = 2, numRBs = 4, numWRs = 6, numTEs = 3, numOTs = 3, numOGs = 4, numCs = 2; // Number of players at each offensive position

    private int numDEs = 4, numDTs = 5, numOLBs = 4, numCBs = 6, numSs = 4, numMLBs = 3; // Number of players at each defensive position

    private int numKs = 1, numPs = 1, numLSs = 1; // Number of players at each special teams position

    private Player[] players = new Player[53];
    public Player[] QBs = new Player[numQBs], RBs = new Player[numRBs], WRs = new Player[numWRs]; // QBs, RBs, WRs
    private Player[] TEs = new Player[numTEs], OTs = new Player[numOTs], OGs = new Player[numOGs]; // TEs, OTs, OGs
    private Player[] Cs = new Player[numCs], DEs = new Player[numDEs], DTs = new Player[numDTs]; // Cs, DEs, DTs
    private Player[] OLBs = new Player[numOLBs], CBs = new Player[numCBs], Ss = new Player[numSs]; // OLBs, CBs, Ss
    private Player[] MLBs = new Player[numMLBs], Ks = new Player[numKs], Ps = new Player[numPs]; // MLBs, Ks, Ps
    private Player[] LSs = new Player[numLSs]; // LSs

    public Team() {
        this.teamCity = new RandomDataGenerator().getRandomTeamCity();
        this.teamMascot = new RandomDataGenerator().getRandomTeamMascot();
    }

    /**
     * Generates players for each position and adds them to the players array.
     * Also reorders the players in the depth chart.
     */
    public void generatePlayers() {
        int index = 0;
        // Generate QBs
        for (int i = 0; i < numQBs; i++) {
            players[index++] = QBs[i] = new OffensivePlayer(Position.QB);
        }
        // Generate RBs
        for (int i = 0; i < numRBs; i++) {
            players[index++] = RBs[i] = new OffensivePlayer(Position.RB);
        }
        // Generate WRs
        for (int i = 0; i < numWRs; i++) {
            players[index++] = WRs[i] = new OffensivePlayer(Position.WR);
        }
        // Generate TEs
        for (int i = 0; i < numTEs; i++) {
            players[index++] = TEs[i] = new OffensivePlayer(Position.TE);
        }
        // Generate OTs
        for (int i = 0; i < numOTs; i++) {
            players[index++] = OTs[i] = new OffensivePlayer(Position.OT);
        }
        // Generate OGs
        for (int i = 0; i < numOGs; i++) {
            players[index++] = OGs[i] = new OffensivePlayer(Position.OG);
        }
        // Generate Cs
        for (int i = 0; i < numCs; i++) {
            players[index++] = Cs[i] = new OffensivePlayer(Position.C);
        }
        // Generate DEs
        for (int i = 0; i < numDEs; i++) {
            players[index++] = DEs[i] = new DefensivePlayer(Position.DE);
        }
        // Generate DTs
        for (int i = 0; i < numDTs; i++) {
            players[index++] = DTs[i] = new DefensivePlayer(Position.DT);
        }
        // Generate OLBs
        for (int i = 0; i < numOLBs; i++) {
            players[index++] = OLBs[i] = new DefensivePlayer(Position.OLB);
        }
        // Generate CBs
        for (int i = 0; i < numCBs; i++) {
            players[index++] = CBs[i] = new DefensivePlayer(Position.CB);
        }
        // Generate Ss
        for (int i = 0; i < numSs; i++) {
            players[index++] = Ss[i] = new DefensivePlayer(Position.S);
        }
        // Generate MLBs
        for (int i = 0; i < numMLBs; i++) {
            players[index++] = MLBs[i] = new DefensivePlayer(Position.MLB);
        }
        // Generate Ks
        for (int i = 0; i < numKs; i++) {
            players[index++] = Ks[i] = new SpecialTeamsPlayer(Position.K);
        }
        // Generate Ps
        for (int i = 0; i < numPs; i++) {
            players[index++] = Ps[i] = new SpecialTeamsPlayer(Position.P);
        }
        // Generate LSs
        for (int i = 0; i < numLSs; i++) {
            players[index++] = LSs[i] = new SpecialTeamsPlayer(Position.LS);
        }

        reOrderDepthChart();
    }

    // Reorder players in depth chart
    public void reOrderDepthChart(){
        // Sort players by rating in descending order for each position
        Arrays.sort(QBs, Comparator.comparing(Player::getRating).reversed());
        Arrays.sort(RBs, Comparator.comparing(Player::getRating).reversed());
        Arrays.sort(WRs, Comparator.comparing(Player::getRating).reversed());
        Arrays.sort(TEs, Comparator.comparing(Player::getRating).reversed());
        Arrays.sort(OTs, Comparator.comparing(Player::getRating).reversed());
        Arrays.sort(OGs, Comparator.comparing(Player::getRating).reversed());
        Arrays.sort(Cs, Comparator.comparing(Player::getRating).reversed());
        Arrays.sort(DEs, Comparator.comparing(Player::getRating).reversed());
        Arrays.sort(DTs, Comparator.comparing(Player::getRating).reversed());
        Arrays.sort(OLBs, Comparator.comparing(Player::getRating).reversed());
        Arrays.sort(CBs, Comparator.comparing(Player::getRating).reversed());
        Arrays.sort(Ss, Comparator.comparing(Player::getRating).reversed());
        Arrays.sort(MLBs, Comparator.comparing(Player::getRating).reversed());
        Arrays.sort(Ks, Comparator.comparing(Player::getRating).reversed());
        Arrays.sort(Ps, Comparator.comparing(Player::getRating).reversed());
        Arrays.sort(LSs, Comparator.comparing(Player::getRating).reversed());
    }

    @Override
    public String toString() {
        return "[ " + teamCity + " " + teamMascot + " ]" + "\n" +
                "[ Team Rating: " + getTeamRating() + " ]" + "\n" +
                "[ Offense Rating: " + getTeamOffenseRating() + " ]" + "\n" +
                "[ Defense Rating: " + getTeamDefenseRating() + " ]" + "\n" +
                "[ Special Teams Rating: " + getTeamSpecialRating() + " ]" + "\n" +
                "QBs:" + "\n" + Arrays.toString(QBs) + "\n" +
                "RBs:" + "\n" + Arrays.toString(RBs) + "\n" +
                "WRs:" + "\n" + Arrays.toString(WRs) + "\n" +
                "TEs:" + "\n" + Arrays.toString(TEs) + "\n" +
                "OTs:" + "\n" + Arrays.toString(OTs) + "\n" +
                "OGs:" + "\n" + Arrays.toString(OGs) + "\n" +
                "Cs:" + "\n" + Arrays.toString(Cs) + "\n" +
                "DEs:" + "\n" + Arrays.toString(DEs) + "\n" +
                "DTs:" + "\n" + Arrays.toString(DTs) + "\n" +
                "OLBs:" + "\n" + Arrays.toString(OLBs) + "\n" +
                "CBs:" + "\n" + Arrays.toString(CBs) + "\n" +
                "Ss:" + "\n" + Arrays.toString(Ss) + "\n" +
                "MLBs:" + "\n" + Arrays.toString(MLBs) + "\n" +
                "Ks:" + "\n" + Arrays.toString(Ks) + "\n" +
                "Ps:" + "\n" + Arrays.toString(Ps) + "\n" +
                "LSs:" + "\n" + Arrays.toString(LSs) + "\n" +
                '}';
    }

    public String getTeamCity() {
        return teamCity;
    }
    public String getTeamMascot() {
        return teamMascot;
    }
    public Player[] getPlayers() {
        return players;
    }
    public Player getPlayer(int index) {
        return players[index];
    }
    public Player[] getQBs() {
        return QBs;
    }
    public Player[] getRBs() {
        return RBs;
    }
    public Player[] getWRs() {
        return WRs;
    }
    public Player[] getTEs() {
        return TEs;
    }
    public Player[] getOTs() {
        return OTs;
    }
    public Player[] getOGs() {
        return OGs;
    }
    public Player[] getCs() {
        return Cs;
    }
    public Player[] getDEs() {
        return DEs;
    }
    public Player[] getDTs() {
        return DTs;
    }
    public Player[] getOLBs() {
        return OLBs;
    }
    public Player[] getCBs() {
        return CBs;
    }
    public Player[] getSs() {
        return Ss;
    }
    public Player[] getMLBs() {
        return MLBs;
    }
    public Player[] getKs() {
        return Ks;
    }
    public Player[] getPs() {
        return Ps;
    }
    public Player[] getLSs() {
        return LSs;
    }
    public Player getPlayerByJerseyNumber(int number) {
        for (Player player : players) {
            if (player.getJerseyNum() == number) {
                return player;
            }
        }
        return null;
    }
    public Player[] getPositionArray(Position position) {
        return switch (position) {
            case QB -> QBs;
            case RB -> RBs;
            case WR -> WRs;
            case TE -> TEs;
            case OT -> OTs;
            case OG -> OGs;
            case C -> Cs;
            case DE -> DEs;
            case DT -> DTs;
            case OLB -> OLBs;
            case CB -> CBs;
            case S -> Ss;
            case MLB -> MLBs;
            case K -> Ks;
            case P -> Ps;
            case LS -> LSs;
            default -> players;
        };
    }

    public int getTeamOffenseRating() {
        int rating = 0;
        rating += QBs[0].getRating() * 2; // Weighted rating for QB
        for (int i = 0; i < 2; i++) {
            rating += RBs[i].getRating();
        }
        for (int i = 0; i < 3; i++) {
            rating += WRs[i].getRating();
        }
        for (int i = 0; i < 2; i++) {
            rating += TEs[i].getRating();
        }
        for (int i = 0; i < 2; i++) {
            rating += OTs[i].getRating();
        }
        for (int i = 0; i < 2; i++) {
            rating += OGs[i].getRating();
        }
        rating += Cs[0].getRating();
        
        // Adjust the rating to be between 0 and 100
        rating = Math.max(0, Math.min(99, rating/12));
        
        return rating;
    }

    public int getTeamDefenseRating(){
        int rating = 0;
        for (int i = 0; i < 2; i++) {
            rating += DEs[i].getRating();
        }
        for (int i = 0; i < 2; i++) {
            rating += DTs[i].getRating();
        }
        for (int i = 0; i < 2; i++) {
            rating += OLBs[i].getRating();
        }
        rating += 1.1 * CBs[0].getRating(); // Weighted rating for CB
        for (int i = 1; i < 2; i++) {
            rating += CBs[i].getRating();
        }
        for (int i = 0; i < 2; i++) {
            rating += Ss[i].getRating();
        }
        rating += 1.1 * MLBs[0].getRating(); // Weighted rating for MLB
        return Math.max(0, Math.min(99, rating/9));
    }

    public int getTeamSpecialRating(){
        int rating = 0;
        rating += Ks[0].getRating();
        rating += Ps[0].getRating();
        rating += 0.9 * LSs[0].getRating(); // Weighted rating for LS
        rating = Math.max(0, Math.min(99, rating/3)); // Adjust the rating to be between 0 and 99
        return rating;
    }

    public int getTeamRating() {
        int offenseRating = getTeamOffenseRating();
        int defenseRating = getTeamDefenseRating();
        int specialRating = getTeamSpecialRating();

        // Adjust the weights for offense, defense, and special teams ratings
        int weightedRating = (4 * offenseRating + 4 * defenseRating + specialRating) / 9;

        // Ensure the overall team rating is between 0 and 100
        int overallRating = Math.max(0, Math.min(99, weightedRating));
        return overallRating;
    }
}
