package hotelreservation;

public enum Season {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private int multiplayer;

    Season(int multiplayer) {
        this.multiplayer = multiplayer;
    }

    public double getMultiplayer() {
        return multiplayer;
    }
}
