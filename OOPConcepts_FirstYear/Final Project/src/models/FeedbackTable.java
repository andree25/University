package models;

public class FeedbackTable {

    int id;
    String client, trainer, stars, feedback;

    public FeedbackTable(int id, String client, String trainer, String stars, String feedback) {
        this.id = id;
        this.client = client;
        this.trainer = trainer;
        this.stars = stars;
        this.feedback = feedback;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
