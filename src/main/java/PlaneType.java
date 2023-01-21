public enum PlaneType {
    BOEING747(150, 6000),
    BOEING787(250, 10000),
    A320(170, 6800),
    A330(300, 12000);

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
