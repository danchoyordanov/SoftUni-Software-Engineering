package dealership;

import java.util.ArrayList;
import java.util.List;


public class Dealership {
    public List<Car> data;

    public String name;
    public int capacity;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }


    public void add(Car cars) {
        if (this.capacity > this.data.size()) {
            this.data.add(cars);
        }
    }

    public boolean buy(String manufacturer, String model) {
        int indexToRemove = -1;
        for (int i = 0; i < data.size(); i++) {
            Car cars = this.data.get(i);
            if ((cars.getManufacturer().equals(manufacturer)) && (cars.getModel().equals(model))) {
                indexToRemove = i;
            }
        }
        if (indexToRemove != -1) {
            data.remove(indexToRemove);
            return true;
        }
        return false;
    }

    public Car getLatestCar() {
        Car cars = null;

        for (Car c : this.data) {
            if (cars == null || cars.getYear() < c.getYear()) {
                cars = c;
            }
        }
        return cars;
    }

    public Car getCar(String manufacturer, String model) {
        for (Car car : data) {
            if ((car.getManufacturer().equals(manufacturer)) && (car.getModel().equals(model))) {
                return car;
            }
        }
        return null;
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder out = new StringBuilder("The cars are in a car dealership " + name + ":");
        for (Car car : data) {
            out.append(System.lineSeparator());
            out.append(car.toString());
        }
        return out.toString();
    }
}
