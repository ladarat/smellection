package com.industriallogic.collections.fizzbuzz;

public class FizzBuzz {


    public String answer(int number){
        FizzRule fizzRule = new FizzRule();
        BuzzRule buzzRule = new BuzzRule();
        FizzBuzzRule fizzBuzzRule = new FizzBuzzRule();
        if(fizzBuzzRule.isFizzBuzz(number)){
            return fizzBuzzRule.answer();
        }
        if(fizzRule.isFizz(number)){
            return fizzRule.answer();
        }
        if(BuzzRule.isBuzz(number)){
            return buzzRule.answer();
        }
        return String.valueOf(number);
    }

}
