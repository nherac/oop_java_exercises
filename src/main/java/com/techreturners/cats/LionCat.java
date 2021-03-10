package com.techreturners.cats;

public class LionCat implements Cat {
    private boolean isSleeping;
    private String setting;
    private int averageHeight = 1100;

    public DomesticCat(){
        this.setting = "domestic";
    }

    public boolean isAsleep(){
        
        return isSleeping;
    }

    public void goToSleep(){
        this.isSleeping = true;
    }

    public void wakeUp(){
        this.isSleeping = false;
    }

    public String getSetting(){
       return this.setting;
    }

    public int getAverageHeight() {
        return this.averageHeight;
    }

    public void setAverageHeight(int averageHeight) {
        this.averageHeight = averageHeight;
    }

    public String eat(){
        return "Roar!!!!";
    }
    
    
}
