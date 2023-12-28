package Components.Players;

public class QuarterBack extends Player{
    public QuarterBack(Position position, int rating) {
        super(position, rating);
    }

    @Override
    public String toString() {
        return "QuarterBack{" +
                "name='" + name + '\'' +
                ", jerseyNum=" + jerseyNum +
                '}';
    }
}
