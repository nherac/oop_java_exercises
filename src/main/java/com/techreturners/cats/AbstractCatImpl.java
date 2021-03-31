package com.techreturners.cats;


public abstract class AbstractCatImpl implements Cat {
private boolean sleeping;
private int averageHeight;
private String setting;
private String eatNoise;

protected AbstractCatImpl(String eatNoise,int averageHeight, String setting){
this.eatNoise = eatNoise;
this.averageHeight =averageHeight;
this.setting = setting;
}

public boolean isAsleep() { 
    return this.sleeping;
}

public boolean goToSleep() { 
    this.sleeping = true;

    return sleeping;
}

public boolean wakeUp() { 
    this.sleeping = false; 
    return sleeping;
}

public String getSetting() {  
    return this.setting;  
}

public int getAverageHeight() { 
    return this.averageHeight;
 }

public String eat() {
    return this.eatNoise;
}

}