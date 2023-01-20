public enum PlaneType {
    BOEING747(150, 2000),
    BOEING787(250, 4000),
    A320(170, 2500),
    A330(300, 4500);

    private final int capacity;
    private final double totalWeight;

    PlaneType(int capacity, double totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}
