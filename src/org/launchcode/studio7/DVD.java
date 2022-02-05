package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{

    public DVD(){
        super(5000, "570-1600", "RS-PC and EFMplus");
    }

    @Override
    public void spinDisc(){
        System.out.println("A DVD spins at a rate of " + this.getSpinRate() + "RPM");
    }

    @Override
    public void storeData(){
        System.out.println("CD can store" + this.getStorageCapacity() + "MB of data");
    }

    @Override
    public void reportError(){
        System.out.println("DVD reports errors " + this.getErrorCodes());
    }
}
