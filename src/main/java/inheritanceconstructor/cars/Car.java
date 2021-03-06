package inheritanceconstructor.cars;

public class Car {

    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        if (tankCapacity < fuel) {
            throw new IllegalArgumentException("Több üzemanyagot akarsz tankolni, mit a tank kapacitása!");
        }
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        this.fuel += fuel;
    }

    public void drive(int km) {
        if (km * fuelRate / 100 > fuel) {
            throw new RuntimeException("Nincs elég üzemanyag!");
            // ezt pl egy repülőgépen azért nem szívesen látná az ember :D
        }
        fuel -= km * fuelRate / 100;
    }

    public double calculateRefillAmount() {
        return getTankCapacity() - getFuel();
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }
}