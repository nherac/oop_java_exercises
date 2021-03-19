package com.techreturners.cats;


public abstract class Abstract implements Cat {
    private boolean sleeping;
    private int height;
    

    @Override
    public boolean isAsleep() {
        return this.sleeping;
    }

    @Override
    public boolean goToSleep() {
        this.sleeping = true;
        return sleeping;
    }

    @Override
    public boolean wakeUp() {
        this.sleeping = false;
        return this.sleeping;
    }

    public String getSetting() {
        return "";
    }

    public int getAverageHeight() {
        return height;
    }

    public String eat() {
        return null;
    }
}