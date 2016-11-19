package com.industriallogic.collections.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {


    public String answer(int number) {

        List<Rule> ruleList = new ArrayList<Rule>();
        ruleList.add(new FizzBuzzRule());
        ruleList.add(new FizzRule());
        ruleList.add(new BuzzRule());

        for (Rule rule : ruleList) {
            if (rule.check(number)) {
                return rule.answer();
            }
        }

        return String.valueOf(number);
    }

}
