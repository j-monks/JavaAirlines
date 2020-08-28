public abstract class Plane {

    private int capacity;
    private double totalWeightInKg;

    public Plane(int capacity, double totalWeightInKg) {
        this.capacity = capacity;
        this.totalWeightInKg = totalWeightInKg;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getTotalWeightInKg() {
        return totalWeightInKg;
    }
}
