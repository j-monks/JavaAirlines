public class Plane {

    private PlaneType planeType;


    public Plane(PlaneType planeType) {
      this.planeType = planeType;
    }

    public int getCapacity() {
        return planeType.getCapacity();
    }

    public double getTotalWeightInKg() {
        return planeType.getTotalWeightInKg();
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }
}
