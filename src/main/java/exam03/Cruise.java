package exam03;

// (c) 2021 "Last Cruise Company"
// (p) Smart public transport solutions from Life-threatening Bt. (tm)

import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private double basicPrice;
    private LocalDate sailing;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void bookPassenger(Passenger passenger) {
        if (boat.getMaxPassengers() == passengers.size()) {
            throw new IllegalArgumentException("Bobo, you're not going anywhere with this ship. " +
                    "Every place on the ship sold out! ");
        }
        passengers.add(passenger);
    }

    public double getPriceForPassenger(Passenger passenger) {
        return basicPrice * passenger.getCruiseClass().getMultiplier();
    }

    public Passenger findPassengerByName(String name) {
        for (Passenger passenger: passengers) {
            if (passenger.getName().equals(name)) {
                return passenger;
            }
        }
        throw new IllegalArgumentException("Bobo, don't try this on me! " +
                "The given name is not even on the passenger list! ");
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> names = new ArrayList<>();
        for (Passenger passenger : passengers) {
            names.add(passenger.getName());
        }
        Collections.sort(names);
        return names;
    }

    public double sumAllBookingsCharged () {
        double sum = 0;
        for (Passenger passenger : passengers) {
            sum += getPriceForPassenger(passenger);
        }
        return sum;
    }

    public Map<CruiseClass, Integer> countPassengerByClass () {
        Map<CruiseClass, Integer> passengerByClass = new HashMap<>();
        for (Passenger passenger: passengers) {
            CruiseClass cruiseClass = passenger.getCruiseClass();
            if (passengerByClass.containsKey(cruiseClass)) {
                passengerByClass.put(cruiseClass, passengerByClass.get(cruiseClass) + 1);
            } else {
                passengerByClass.put(cruiseClass, 1);
            }
        }
        return passengerByClass;
    }
}