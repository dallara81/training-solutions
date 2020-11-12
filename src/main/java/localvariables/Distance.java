package localvariables;

public class Distance {

    // Távolság (def.)
    private double distanceInKm;

    // Pontosság-ellenőrtő (def.)
    private boolean exact;

    // Core
    public Distance(double distanceInKm, boolean exact) {
        this.distanceInKm = distanceInKm;
        this.exact = exact;
    }

    public double getDistanceInKm() {
        return distanceInKm;
    }

    public boolean isExact() {
        return exact;
    }
}
