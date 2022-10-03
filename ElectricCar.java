package stuff.java;

public class ElectricCar extends Car implements Chargeable {
    int BatteryCharge;

    public ElectricCar(String manufacturerName, int miles, int price, int seats, Option[] options, int doors)
    {
        super(manufacturerName, miles, price, seats, options, doors);
    }

    
    public void chargeUp() {
        BatteryCharge = 100;
    }
    public int getBatteryCharge() {
        return BatteryCharge;
    }
}
