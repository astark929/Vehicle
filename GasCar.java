package stuff.java;

public class GasCar extends Car implements Combustible{
    private int fuelLevel;

    public GasCar(String manufacturerName, int miles, int price, int seats, Option[] options, int doors)
    {
        super(manufacturerName, miles, price, seats, options, doors);
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    @Override
    public void tankUp(){
        fuelLevel = 100;
    }


}
