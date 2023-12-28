import Components.Players.Player;
import Components.Players.Position;
import Components.Players.QuarterBack;

public class test {
    public static void main(String[] args){
        Player player = new QuarterBack(Position.QB, 87);
        System.out.println(player);
    }
}
