package com.techreturners.cats;

interface Cat {
    boolean isAsleep();
    void goToSleep();
    void wakeUp();
    String getSetting();
    int getAverageHeight();
    default String eat(){
        return "pending to do";
    };

    

    

}
