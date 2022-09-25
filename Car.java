package stuff.java;

public class Car extends Vehicle {
    private int doors;

    public Car(String manufacturerName, int miles, int price, int seats, Option[] options, int doors) {
        super(manufacturerName, miles, price, seats, options);
        this.doors = doors;
    }

    public int getNumberOfDoors() {
        return doors;
    }

    public void setDoors(int newDoors) {
        this.doors = newDoors;
    }
}