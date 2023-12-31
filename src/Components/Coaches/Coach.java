package Components.Coaches;

import Components.Players.RandomDataGenerator;

public abstract class Coach {
    private CoachType coachType;
    private String name;
    private int rating;

    // Getters and Setters
    public CoachType getCoachType() {
        return coachType;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public void setCoachType(CoachType coachType) {
        this.coachType = coachType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    // Constructor
    public Coach(CoachType coachType) {
        this.coachType = coachType;
        this.name = new RandomDataGenerator().getRandomName();
        this.rating = new RandomDataGenerator().getRandomRating();
    }
}
