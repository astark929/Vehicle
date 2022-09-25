package stuff.java;

interface Chargeable {

    int chargeUp = 0;

    default void chargeUp(){

        final int chargeUp = 100;
    }


    default int getBatteryCharge(){

        return chargeUp;
    }

}
