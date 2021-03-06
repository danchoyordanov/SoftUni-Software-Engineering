package carShopUpdate;


public class Seat extends CarImpl implements Sellable {

    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced,Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String countryProduced() {
        return  this.countryProduced;
    }
    @Override
    public String toString(){
        return String.format("This is %s produced in %s and have %d tires%n%s sells for %f",
                this.model,this.countryProduced,TIRES,this.model,this.price);
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
