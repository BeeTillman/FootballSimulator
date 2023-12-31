package Components.Coaches;

import Components.Coaches.Stats.CoachStats;
import Components.Players.RandomDataGenerator;

public abstract class Coach {
    private CoachType coachType;
    private String name;
    private int rating;
    private CoachStats coachStats = new CoachStats();

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

    public CoachStats getCoachStats() {
        return coachStats;
    }

    public void setCoachStats(CoachStats coachStats) {
        this.coachStats = coachStats;
    }

    // Constructor
    public Coach(CoachType coachType) {
        this.coachType = coachType;
        this.name = new RandomDataGenerator().getRandomName();
        this.rating = new RandomDataGenerator().getRandomRating();
        this.coachStats = new CoachStats();
    }

    // Methods

    @Override
    public String toString() {
        return name + "(" +rating+ ")";
    }
}
