package com.industriallogic.collections.fizzbuzz;

public class FizzBuzzRule implements Rule{
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public boolean check(int number) {
        return new FizzRule().check(number) && new BuzzRule().check(number);
    }

    public String answer() {
        return FIZZ_BUZZ;
    }
}
