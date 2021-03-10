package com.techreturners.cats;

public class DomesticCat implements Cat{
    //Attributes
    private boolean isSleeping;
    private String setting;
    private int averageHeight = 23;

    //Methods

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
        return "Purrrrrrr";
    }



    
}
