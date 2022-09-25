package stuff.java;

interface Combustible {

    int tankUp = 0;

    default void tankUp(){
        final int tankUp = 100;
    }


    default int getFuelLevel(){
        return tankUp;
    }

}
