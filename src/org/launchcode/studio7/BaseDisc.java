package org.launchcode.studio7;

public abstract class BaseDisc {
    private String discTitle;
    private String discContent;
    private int storageCapacity;
    private String spinRate;
    private String errorCodes;
    private int storageUsed = 0;

    public BaseDisc(int storageCapacity, String rateOfSpin, String codesOfErrors) {
        this.storageCapacity = storageCapacity;
        this.spinRate = rateOfSpin;
        this.errorCodes = codesOfErrors;
    }

    public String getErrorCodes() {
        return errorCodes;
    }

    public String getDiscTitle() {
        return discTitle;
    }

    public void setDiscTitle(String title) {
        this.discTitle = title;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public String getSpinRate() {
        return spinRate;
    }

    public void setSpinRate(String spinRate) {
        this.spinRate = spinRate;
    }

    public String getDiscContent() {
        return discContent;
    }

    public void setDiscContent(String discCon, int contentSize) {
        int combinedStorage = contentSize + this.getStorageUsed();
        if((contentSize + this.getStorageUsed()) <= this.getStorageCapacity()) {
            this.discContent = discCon;
            this.setStorageUsed(combinedStorage);
            System.out.println("Successfully wrote " + discCon + " to disc with size of " + contentSize + " MB. " + (this.getStorageCapacity() - combinedStorage) + " MB left.");
        } else {
            System.out.println("UNABLE TO COMPLETE WRITE DUE TO INSUFFICIENT SPACE");
        }
    }

    public int getStorageUsed() {
        return storageUsed;
    }

    public void setStorageUsed(int storageUsed) {
        this.storageUsed = storageUsed;
    }
}
