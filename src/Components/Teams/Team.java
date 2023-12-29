package Components.Teams;

import Components.Players.Player;
import Components.Players.Position;
import Components.Players.PositionedPlayers.OffensivePlayer;
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

    // Generate players for each position and add them to the players array
    public void generatePlayers() {
        for (int i = 0; i < numQBs; i++) { // Generate QBs
            QBs[i] = new OffensivePlayer(Position.QB);
        }
        for (int i = 0; i < numRBs; i++) { // Generate RBs
            RBs[i] = new OffensivePlayer(Position.RB);
        }
        for (int i = 0; i < numWRs; i++) { // Generate WRs
            WRs[i] = new OffensivePlayer(Position.WR);
        }
        for (int i = 0; i < numTEs; i++) { // Generate TEs
            TEs[i] = new OffensivePlayer(Position.TE);
        }
        for (int i = 0; i < numOTs; i++) { // Generate OTs
            OTs[i] = new OffensivePlayer(Position.OT);
        }
        for (int i = 0; i < numOGs; i++) { // Generate OGs
            OGs[i] = new OffensivePlayer(Position.OG);
        }
        for (int i = 0; i < numCs; i++) { // Generate Cs
            Cs[i] = new OffensivePlayer(Position.C);
        }
        for (int i = 0; i < numDEs; i++) { // Generate DEs
            DEs[i] = new OffensivePlayer(Position.DE);
        }
        for (int i = 0; i < numDTs; i++) { // Generate DTs
            DTs[i] = new OffensivePlayer(Position.DT);
        }
        for (int i = 0; i < numOLBs; i++) { // Generate OLBs
            OLBs[i] = new OffensivePlayer(Position.OLB);
        }
        for (int i = 0; i < numCBs; i++) { // Generate CBs
            CBs[i] = new OffensivePlayer(Position.CB);
        }
        for (int i = 0; i < numSs; i++) { // Generate Ss
            Ss[i] = new OffensivePlayer(Position.S);
        }
        for (int i = 0; i < numMLBs; i++) { // Generate MLBs
            MLBs[i] = new OffensivePlayer(Position.MLB);
        }
        for (int i = 0; i < numKs; i++) { // Generate Ks
            Ks[i] = new OffensivePlayer(Position.K);
        }
        for (int i = 0; i < numPs; i++) { // Generate Ps
            Ps[i] = new OffensivePlayer(Position.P);
        }
        for (int i = 0; i < numLSs; i++) { // Generate LSs
            LSs[i] = new OffensivePlayer(Position.LS);
        }

        reOrderDepthChart();

        for (int i = 0; i < numQBs + numRBs + numWRs + numTEs + numOTs + numOGs + numCs + numDEs + numDTs + numOLBs + numCBs + numSs + numMLBs + numKs + numPs + numLSs; i++) { // Add players to players array
            if (i < numQBs) { // Add QBs
                players[i] = QBs[i];
            } else if (i < numQBs + numRBs) { // Add RBs
                players[i] = RBs[i - numQBs];
            } else if (i < numQBs + numRBs + numWRs) { // Add WRs
                players[i] = WRs[i - numQBs - numRBs];
            } else if (i < numQBs + numRBs + numWRs + numTEs) { // Add TEs
                players[i] = TEs[i - numQBs - numRBs - numWRs];
            } else if (i < numQBs + numRBs + numWRs + numTEs + numOTs) { // Add OTs
                players[i] = OTs[i - numQBs - numRBs - numWRs - numTEs];
            } else if (i < numQBs + numRBs + numWRs + numTEs + numOTs + numOGs) { // Add OGs
                players[i] = OGs[i - numQBs - numRBs - numWRs - numTEs - numOTs];
            } else if (i < numQBs + numRBs + numWRs + numTEs + numOTs + numOGs + numCs) { // Add Cs
                players[i] = Cs[i - numQBs - numRBs - numWRs - numTEs - numOTs - numOGs];
            } else if (i < numQBs + numRBs + numWRs + numTEs + numOTs + numOGs + numCs + numDEs) { // Add DEs
                players[i] = DEs[i - numQBs - numRBs - numWRs - numTEs - numOTs - numOGs - numCs];
            } else if (i < numQBs + numRBs + numWRs + numTEs + numOTs + numOGs + numCs + numDEs + numDTs) { // Add DTs
                players[i] = DTs[i - numQBs - numRBs - numWRs - numTEs - numOTs - numOGs - numCs - numDEs];
            } else if (i < numQBs + numRBs + numWRs + numTEs + numOTs + numOGs + numCs + numDEs + numDTs + numOLBs) { // Add OLBs
                players[i] = OLBs[i - numQBs - numRBs - numWRs - numTEs - numOTs - numOGs - numCs - numDEs - numDTs];
            } else if (i < numQBs + numRBs + numWRs + numTEs + numOTs + numOGs + numCs + numDEs + numDTs + numOLBs + numCBs) { // Add CBs
                players[i] = CBs[i - numQBs - numRBs - numWRs - numTEs - numOTs - numOGs - numCs - numDEs - numDTs - numOLBs];
            } else if (i < numQBs + numRBs + numWRs + numTEs + numOTs + numOGs + numCs + numDEs + numDTs + numOLBs + numCBs + numSs) { // Add Ss
                players[i] = Ss[i - numQBs - numRBs - numWRs - numTEs - numOTs - numOGs - numCs - numDEs - numDTs - numOLBs - numCBs];
            } else if (i < numQBs + numRBs + numWRs + numTEs + numOTs + numOGs + numCs + numDEs + numDTs + numOLBs + numCBs + numSs + numMLBs) { // Add MLBs
                players[i] = MLBs[i - numQBs - numRBs - numWRs - numTEs - numOTs - numOGs - numCs - numDEs - numDTs - numOLBs - numCBs - numSs];
            } else if (i < numQBs + numRBs + numWRs + numTEs + numOTs + numOGs + numCs + numDEs + numDTs + numOLBs + numCBs + numSs + numMLBs + numKs) { // Add Ks
                players[i] = Ks[i - numQBs - numRBs - numWRs - numTEs - numOTs - numOGs - numCs - numDEs - numDTs - numOLBs - numCBs - numSs - numMLBs];
            } else if (i < numQBs + numRBs + numWRs + numTEs + numOTs + numOGs + numCs + numDEs + numDTs + numOLBs + numCBs + numSs + numMLBs + numKs + numPs) { // Add Ps
                players[i] = Ps[i - numQBs - numRBs - numWRs - numTEs - numOTs - numOGs - numCs - numDEs - numDTs - numOLBs - numCBs - numSs - numMLBs - numKs];
            } else if (i < numQBs + numRBs + numWRs + numTEs + numOTs + numOGs + numCs + numDEs + numDTs + numOLBs + numCBs + numSs + numMLBs + numKs + numPs + numLSs) { // Add LSs
                players[i] = LSs[i - numQBs - numRBs - numWRs - numTEs - numOTs - numOGs - numCs - numDEs - numDTs - numOLBs - numCBs - numSs - numMLBs - numKs - numPs];
            }
        }
    }

    // Reorder players in depth chart
    public void reOrderDepthChart(){
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
        return "[ " + teamCity + teamMascot + " ]" +
                ", QBs=" + Arrays.toString(QBs) + "\n" +
                ", RBs=" + Arrays.toString(RBs) + "\n" +
                ", WRs=" + Arrays.toString(WRs) + "\n" +
                ", TEs=" + Arrays.toString(TEs) + "\n" +
                ", OTs=" + Arrays.toString(OTs) + "\n" +
                ", OGs=" + Arrays.toString(OGs) + "\n" +
                ", Cs=" + Arrays.toString(Cs) + "\n" +
                ", DEs=" + Arrays.toString(DEs) + "\n" +
                ", DTs=" + Arrays.toString(DTs) + "\n" +
                ", OLBs=" + Arrays.toString(OLBs) + "\n" +
                ", CBs=" + Arrays.toString(CBs) + "\n" +
                ", Ss=" + Arrays.toString(Ss) + "\n" +
                ", MLBs=" + Arrays.toString(MLBs) + "\n" +
                ", Ks=" + Arrays.toString(Ks) + "\n" +
                ", Ps=" + Arrays.toString(Ps) + "\n" +
                ", LSs=" + Arrays.toString(LSs) + "\n" +
                '}';
    }
}
