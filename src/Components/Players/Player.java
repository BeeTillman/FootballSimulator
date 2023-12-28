package Components.Players;


public abstract class Player {
    private Position position = null;
    private int rating = 0;
    private PlayerStats playerStats = new PlayerStats();
    String name;
    int jerseyNum;

    public Player(Position position, int rating) {
        this.position = position;
        this.rating = rating;
        this.name = new RandomDataGenerator().getRandomName();
        int[] testJerseys = new int[99];
        this.jerseyNum = new RandomDataGenerator().getRandomJerseyNumber(testJerseys);
    }
}
