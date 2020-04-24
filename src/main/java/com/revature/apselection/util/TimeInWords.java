package com.revature.apselection.util;

public class TimeInWords {

    static String timeInWords(int h, int m) {
        // Variables and mappings
        String fullPhrase;
        String[] phrases = {" o' clock", " minute past ", " minutes past ", " minutes to ", " minute to "};
        String[] hours = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","one"};
        String[] minutesOnes = {"one","two","three","four","five","six","seven","eight","nine"};
        String[] minutesTens = {"ten","eleven","twelve","thirteen","fourteen",
                                 "fifteen","sixteen","seventeen","eighteen","ninteen","twenty","thirty"};
        
        // Mapping Process
        if(m==0){
            fullPhrase = hours[h-1] + phrases[0];
        } else if(m==15){
            fullPhrase = "quarter past " + hours[h-1];
        } else if(m==30){
            fullPhrase = "half past " + hours[h-1];
        } else if(m==45){
            fullPhrase = "quarter to " + hours[h];
        } else if(m==1){
            fullPhrase = minutesOnes[m-1] + phrases[1] + hours[h-1];
        } else if(m>1 && m<10){
            fullPhrase = minutesOnes[m-1] + phrases[2] + hours[h-1];
        } else if(m>=10 && m<20){
            m -= 9;
            fullPhrase = minutesTens[m-1] + phrases[2] + hours[h-1];
        } else if(m==20){
            fullPhrase = minutesTens[minutesTens.length-2] + phrases[2] + hours[h-1];
        } else if(m>20 && m<30){
            m -= 20;
            fullPhrase = minutesTens[minutesTens.length-2] + " " + minutesOnes[m-1] + phrases[2] + hours[h-1];
        } else if(m>30 && m<40){
            m = 60 - m;
            m -= 20;
            fullPhrase = minutesTens[minutesTens.length-2] + " " + minutesOnes[m-1] + phrases[3] + hours[h];
        } else if(m==40){
            m = 60 - m;
            fullPhrase = minutesTens[minutesTens.length-2] + phrases[3] + hours[h];
        } else if(m>40 && m<=50){
            m = 60 - m;
            m -= 9;
            fullPhrase = minutesTens[m-1] + phrases[3] + hours[h];
        } else if(m>50 && m<59){
            m = 60 - m;
            fullPhrase = minutesOnes[m-1] + phrases[3] + hours[h];
        } else if(m==59){
            m = 60 - m;
            fullPhrase = minutesOnes[m-1] + phrases[4] + hours[h];
        } else {
            fullPhrase = null;
        }
        return fullPhrase;
    }
}
