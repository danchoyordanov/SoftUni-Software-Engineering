package hotelreservation;

public class PriceCalculator {
    private double pricePerDay;
    private int numberOfDays;
    private DiscountType discountType;
    private Season season;

    public PriceCalculator(double pricePerDay, int numberOfDays, DiscountType discountType, Season season) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.discountType = discountType;
        this.season = season;
    }

    public double calculate() {
        return pricePerDay * numberOfDays * season.getMultiplayer() - (pricePerDay *
                numberOfDays * season.getMultiplayer() *
                discountType.getPercentage() / 100);
    }
}
