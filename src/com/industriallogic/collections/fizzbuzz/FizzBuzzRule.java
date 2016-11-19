package com.industriallogic.collections.fizzbuzz;

public class FizzBuzzRule {
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public boolean isFizzBuzz(int number) {
        return new FizzRule().isFizz(number) && new BuzzRule().isBuzz(number);
    }

    public String answer() {
        return FIZZ_BUZZ;
    }
}
