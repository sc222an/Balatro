public class Card {
    private int score;
    private String name;
    private String rank;
    private String suit;
    private String enhancement;
    private String seal;
    private boolean used;

    public Card(int score, String cardRank, String cardSuit, String cardEnhancement, String cardSeal) {
        this.score = score;
        this.rank = cardRank;
        this.suit = cardSuit;
        this.enhancement = cardEnhancement;
        this.seal = cardSeal;
        this.name = cardRank + " of " + cardSuit;
        used = false;

    }

    public int getScore() {
        return score;
    }

    public String getRank() {
        return this.rank;
    }

    public String getSuit() {
        return this.suit;
    }

    public String getEnhancement() {
        return this.enhancement;
    }

    public String getSeal() {
        return this.seal;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setRank(String cardRank) {
        this.rank = cardRank;
    }

    public void setSuit(String cardSuit) {
        this.suit = cardSuit;
    }

    public void setEnhancement(String cardEnhancement) {
        this.enhancement = cardEnhancement;
    }

    public void setSeal(String cardSeal) {
        this.seal = cardSeal;
    }
}
