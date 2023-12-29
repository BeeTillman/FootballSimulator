package Components.Players;


public abstract class Player {
    private Position position = null;
    private int rating = 0;
    private PlayerStats playerStats = new PlayerStats();
    String name;
    int jerseyNum;

    // Getters and Setters
    public Position getPosition() {
        return position;
    }

    public int getRating() {
        return rating;
    }

    public PlayerStats getPlayerStats() {
        return playerStats;
    }

    public String getName() {
        return name;
    }

    public int getJerseyNum() {
        return jerseyNum;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setPlayerStats(PlayerStats playerStats) {
        this.playerStats = playerStats;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJerseyNum(int jerseyNum) {
        this.jerseyNum = jerseyNum;
    }

    // Constructor
    public Player(Position position) {
        this.position = position;
        this.rating = new RandomDataGenerator().getRandomRating();
        this.name = new RandomDataGenerator().getRandomName();
        int[] testJerseys = new int[99];
        this.jerseyNum = new RandomDataGenerator().getRandomJerseyNumber(testJerseys);
    }


    @Override
    public String toString() {
        return "Player Info\n" +
                "Name: " + this.name + "\n" +
                "Position: " + this.position + "\n" +
                "Rating: " + this.rating + "\n" +
                "Jersey: " + this.jerseyNum + "\n" +
                "Stats: " + this.playerStats + "\n";
    }
}
