package stuff.java;

public class HybridCar extends Car implements Combustible, Chargeable
{
    private int FuelLevel;
    private int BatteryCharge;

    public HybridCar(String manufacturerName, int miles, int price, int seats, Option[] options, int numDoors) {
        super(manufacturerName, miles, price, seats, options, numDoors);
    }

    public int getNumberOfDoors() {
        return super.getNumberOfDoors();
    }


    public int getFuelLevel() {
        return FuelLevel;
    }

    
    public void tankUp() {
        FuelLevel = 100;
    }

    public int getBatteryCharge() {
        return BatteryCharge;
    }

    
    public void chargeUp() {
        BatteryCharge = 100;
    }



}
