public enum PlaneType {
    BOEING747(10, 500.00);


    private final int capacity;
    private final double totalWeightInKg;

    PlaneType(int capacity, double totalWeightInKg) {
        this.capacity = capacity;
        this.totalWeightInKg = totalWeightInKg;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getTotalWeightInKg() {
        return totalWeightInKg;
    }
}

