package stuff.java;

public class Vehicle {

    private String ManufacturerName;
    private int miles;
    private int price;
    private int numberOfSeats;
    Option[] options = new Option[2];

    public Vehicle(String name, int mile, int price, int seat, Option[] option) {
        this.ManufacturerName = name;
        this.miles = mile;
        this.price = price;
        this.numberOfSeats = seat;
        this.options = option;

    }

    public Vehicle() {

    }

    public String getManufacturerName(){
        return ManufacturerName;
    }

    public int getMilesOnVehicle(){
        return miles;
    }
    public int getPrice(){
        return price;
    }
    public int getNumberOfSeats(){
        return numberOfSeats;
    }


    public void setMiles(int newMiles) {
        this.miles = newMiles;
    }
    public void setPrice(int newPrice) {
        this.price = newPrice;
    }
    public void SetSeats(int newseatNumber) {
        this.numberOfSeats = newseatNumber;
    }
    public void SetName(String Name) {
        this.ManufacturerName = Name;
    }

    public Option[] getOptions() {
        return options;
    }



}
