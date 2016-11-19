package com.industriallogic.collections.fizzbuzz;

public class FizzRule implements Rule{
    public static final String FIZZ = "Fizz";

    public boolean check(int number) {
        return number%3 == 0;
    }

    public String answer(){
        return FIZZ;
    }
}
