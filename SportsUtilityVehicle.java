package stuff.java;

public class SportsUtilityVehicle extends Vehicle {
    private int maxTowingWeight;

    public SportsUtilityVehicle(String manufacturerName, int miles, int price, int seats, Option[] options, int maxTowingWeight) {
        super(manufacturerName, miles, price, seats, options);
        this.maxTowingWeight = maxTowingWeight;
    }

    public void setMaxTowingWeight(int newMaxTowingWeight) {
        this.maxTowingWeight = newMaxTowingWeight;
    }

    public int getMaxTowingWeight() {
        return maxTowingWeight;
    }

}
