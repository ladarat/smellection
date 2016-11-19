package com.industriallogic.collections.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public String answer(int number){
        if(isDivideBy3(number) && number %5 == 0){
            return FIZZ_BUZZ;
        }
        if(isDivideBy3(number)){
            return FIZZ;
        }
        if(number%5 == 0){
            return BUZZ;
        }
        return String.valueOf(number);
    }

    private boolean isDivideBy3(int number) {
        return number%3 == 0;
    }
}
