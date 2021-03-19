package com.techreturners.cats;

public class DomesticCat extends Abstract {

    
         private String sound = "Purrrrrrr";
        private int height = 23;
        
    
        public int getAverageHeight() {
            return height;
        }
    
        public String getSetting() {
            return "domestic";
        }
    
        public String eat() {
            return sound;
        }
    }
 