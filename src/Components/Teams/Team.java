package Components.Teams;

import Components.Players.Player;
import Components.Players.Position;
import Components.Players.PositionedPlayers.OffensivePlayer;
import Components.Players.RandomDataGenerator;

import java.util.Arrays;

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
        for (int i = 0; i < numQBs; i++) { // Reorder QBs in depth chart
            if (QBs[i].getRating() < QBs[i + 1].getRating()) {
                setDepthChartPosition(QBs[i + 1], 1);
            }
        }
        for (int i = 0; i < numRBs; i++) { // Reorder RBs in depth chart
            if (RBs[i].getRating() < RBs[i + 1].getRating()) {
                setDepthChartPosition(RBs[i + 1], 1);
            }
        }
        for (int i = 0; i < numWRs; i++) { // Reorder WRs in depth chart
            if (WRs[i].getRating() < WRs[i + 1].getRating()) {
                setDepthChartPosition(WRs[i + 1], 1);
            }
        }
        for (int i = 0; i < numTEs; i++) { // Reorder TEs in depth chart
            if (TEs[i].getRating() < TEs[i + 1].getRating()) {
                setDepthChartPosition(TEs[i + 1], 1);
            }
        }
        for (int i = 0; i < numOTs; i++) { // Reorder OTs in depth chart
            if (OTs[i].getRating() < OTs[i + 1].getRating()) {
                setDepthChartPosition(OTs[i + 1], 1);
            }
        }
        for (int i = 0; i < numOGs; i++) { // Reorder OGs in depth chart
            if (OGs[i].getRating() < OGs[i + 1].getRating()) {
                setDepthChartPosition(OGs[i + 1], 1);
            }
        }
        for (int i = 0; i < numCs; i++) { // Reorder Cs in depth chart
            if (Cs[i].getRating() < Cs[i + 1].getRating()) {
                setDepthChartPosition(Cs[i + 1], 1);
            }
        }
        for (int i = 0; i < numDEs; i++) { // Reorder DEs in depth chart
            if (DEs[i].getRating() < DEs[i + 1].getRating()) {
                setDepthChartPosition(DEs[i + 1], 1);
            }
        }
        for (int i = 0; i < numDTs; i++) { // Reorder DTs in depth chart
            if (DTs[i].getRating() < DTs[i + 1].getRating()) {
                setDepthChartPosition(DTs[i + 1], 1);
            }
        }
        for (int i = 0; i < numOLBs; i++) { // Reorder OLBs in depth chart
            if (OLBs[i].getRating() < OLBs[i + 1].getRating()) {
                setDepthChartPosition(OLBs[i + 1], 1);
            }
        }
        for (int i = 0; i < numCBs; i++) { // Reorder CBs in depth chart
            if (CBs[i].getRating() < CBs[i + 1].getRating()) {
                setDepthChartPosition(CBs[i + 1], 1);
            }
        }
        for (int i = 0; i < numSs; i++) { // Reorder Ss in depth chart
            if (Ss[i].getRating() < Ss[i + 1].getRating()) {
                setDepthChartPosition(Ss[i + 1], 1);
            }
        }
        for (int i = 0; i < numMLBs; i++) { // Reorder MLBs in depth chart
            if (MLBs[i].getRating() < MLBs[i + 1].getRating()) {
                setDepthChartPosition(MLBs[i + 1], 1);
            }
        }
        for (int i = 0; i < numKs; i++) { // Reorder Ks in depth chart
            if (Ks[i].getRating() < Ks[i + 1].getRating()) {
                setDepthChartPosition(Ks[i + 1], 1);
            }
        }
        for (int i = 0; i < numPs; i++) { // Reorder Ps in depth chart
            if (Ps[i].getRating() < Ps[i + 1].getRating()) {
                setDepthChartPosition(Ps[i + 1], 1);
            }
        }
        for (int i = 0; i < numLSs; i++) { // Reorder LSs in depth chart
            if (LSs[i].getRating() < LSs[i + 1].getRating()) {
                setDepthChartPosition(LSs[i + 1], 1);
            }
        }
    }

    public void setDepthChartPosition(Player player, int position){
        switch(player.getPosition()){
            case QB:
                QBs[Arrays.asList(QBs).indexOf(player)] = QBs[position];
                QBs[position] = player;
                break;
            case RB:
                RBs[Arrays.asList(RBs).indexOf(player)] = RBs[position];
                RBs[position] = player;
                break;
            case WR:
                WRs[Arrays.asList(WRs).indexOf(player)] = WRs[position];
                WRs[position] = player;
                break;
            case TE:
                TEs[Arrays.asList(TEs).indexOf(player)] = TEs[position];
                TEs[position] = player;
                break;
            case OT:
                OTs[Arrays.asList(OTs).indexOf(player)] = OTs[position];
                OTs[position] = player;
                break;
            case OG:
                OGs[Arrays.asList(OGs).indexOf(player)] = OGs[position];
                OGs[position] = player;
                break;
            case C:
                Cs[Arrays.asList(Cs).indexOf(player)] = Cs[position];
                Cs[position] = player;
                break;
            case DE:
                DEs[Arrays.asList(DEs).indexOf(player)] = DEs[position];
                DEs[position] = player;
                break;
            case DT:
                DTs[Arrays.asList(DTs).indexOf(player)] = DTs[position];
                DTs[position] = player;
                break;
            case OLB:
                OLBs[Arrays.asList(OLBs).indexOf(player)] = OLBs[position];
                OLBs[position] = player;
                break;
            case CB:
                CBs[Arrays.asList(CBs).indexOf(player)] = CBs[position];
                CBs[position] = player;
                break;
            case S:
                Ss[Arrays.asList(Ss).indexOf(player)] = Ss[position];
                Ss[position] = player;
                break;
            case MLB:
                MLBs[Arrays.asList(MLBs).indexOf(player)] = MLBs[position];
                MLBs[position] = player;
                break;
            case K:
                Ks[Arrays.asList(Ks).indexOf(player)] = Ks[position];
                Ks[position] = player;
                break;
            case P:
                Ps[Arrays.asList(Ps).indexOf(player)] = Ps[position];
                Ps[position] = player;
                break;
            case LS:
                LSs[Arrays.asList(LSs).indexOf(player)] = LSs[position];
                LSs[position] = player;
                break;
        }
    }
}
