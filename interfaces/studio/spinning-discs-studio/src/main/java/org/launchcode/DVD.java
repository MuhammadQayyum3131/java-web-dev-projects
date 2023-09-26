package org.launchcode;

public class DVD implements OpticalDisc{
    // TODO: Implement your custom interface.

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void storeData() {
        System.out.println("Data was stored to the DVD");

    }

    @Override
    public void writeDiscWithLaser() {
        System.out.println("Data was written with Laser.");
    }

    @Override
    public void readDiscWithLaser() {
        System.out.println("Data was read with Laser.");
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
