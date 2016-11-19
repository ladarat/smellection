package com.industriallogic.collections.fizzbuzz;

public class FizzRule {
    public static final String FIZZ = "Fizz";

    public boolean isFizz(int number) {
        return number%3 == 0;
    }

    public String answer(){
        return FIZZ;
    }
}
