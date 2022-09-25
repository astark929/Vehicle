package stuff.java;

public class PickupTruck extends Vehicle {
    private int CargoCapacity;

    public PickupTruck(String manufacturerName, int miles, int price, int seats, Option[] options, int cargoCapacity) {
        super(manufacturerName, miles, price, seats, options);
        CargoCapacity = cargoCapacity;
    }

    public void setCargoCapacity(int newCargoCapacity) {
        this.CargoCapacity = newCargoCapacity;
    }

    public int getCargoCapacity() {
        return CargoCapacity;
    }

}
