package com.industriallogic.collections.fizzbuzz;

public class BuzzRule {
    public static final String BUZZ = "Buzz";

    public boolean isBuzz(int number) {
        return number %5 == 0;
    }

    public String answer(){
        return BUZZ;
    }
}
