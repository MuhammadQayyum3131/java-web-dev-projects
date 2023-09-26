package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        CD myCD = new CD();
        DVD myDVD = new DVD();


        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCD.spinDisc();
        myCD.storeData();
        myCD.writeDiscWithLaser();
        myCD.readDiscWithLaser();


        myDVD.spinDisc();
        myDVD.storeData();
        myDVD.writeDiscWithLaser();
        myDVD.readDiscWithLaser();

    }
}