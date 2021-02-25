package CardsWithPower;

public enum CardRank {
    ACE(14),
    EIGHT(8),
    FIVE(5),
    FOUR(4),
    JACK(11),
    KING(13),
    NINE(9),
    QUEEN(12),
    SEVEN(7),
    SIX(6),
    TEN(10),
    THREE(3),
    TWO(2);

    private int rankPower;

    CardRank(int rankPower) {
        this.rankPower = rankPower;
    }

    public int getRankPower() {
        return rankPower;
    }
}
