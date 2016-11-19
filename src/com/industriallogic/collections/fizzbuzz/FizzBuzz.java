package com.industriallogic.collections.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {


    public String answer(int number){

        List<Rule> ruleList = new ArrayList<Rule>();
        ruleList.add(new FizzBuzzRule());
        ruleList.add(new FizzRule());
        ruleList.add(new BuzzRule());

        if(ruleList.get(0).check(number)){
            return ruleList.get(0).answer();
        }
        if(ruleList.get(1).check(number)){
            return ruleList.get(1).answer();
        }
        if(ruleList.get(2).check(number)){
            return ruleList.get(2).answer();
        }
        return String.valueOf(number);
    }

}
