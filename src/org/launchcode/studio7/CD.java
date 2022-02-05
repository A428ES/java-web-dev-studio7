package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{

    public CD(){
        super(700, "200-500", "CIRC and EFMP");
    }

    @Override
    public void spinDisc(){
        System.out.println("A CD spins at a rate of " + this.getSpinRate() + "RPM");
    }

    @Override
    public void storeData(){
        System.out.println("CD can store" + this.getStorageCapacity() + "MB of data");
    }

    @Override
    public void reportError(){
        System.out.println("CD reports errors " + this.getErrorCodes());
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
