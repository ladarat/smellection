package com.industriallogic.collections.fizzbuzz;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void give_1_it_should_be_return_1() {
        String actual = fizzBuzz.answer(1);

        Assert.assertEquals("1", actual);
    }

    @Test
    public void give_2_it_should_be_return_2() {
        String actual = fizzBuzz.answer(2);

        Assert.assertEquals("2", actual);
    }

    @Test
    public void give_3_it_should_be_return_Fizz() {
        String actual = fizzBuzz.answer(3);

        Assert.assertEquals(FizzBuzz.FIZZ, actual);
    }

    @Test
    public void give_9_it_should_be_return_Fizz() {
        String actual = fizzBuzz.answer(9);

        Assert.assertEquals(FizzBuzz.FIZZ, actual);
    }

    @Test
    public void give_6_it_should_be_return_Fizz() {
        String actual = fizzBuzz.answer(6);

        Assert.assertEquals(FizzBuzz.FIZZ, actual);
    }

    @Test
    public void give_5_it_should_be_return_Buzz() {
        String actual = fizzBuzz.answer(5);

        Assert.assertEquals(FizzBuzz.BUZZ, actual);
    }

    @Test
    public void give_10_it_should_be_return_Buzz() {
        String actual = fizzBuzz.answer(10);

        Assert.assertEquals(FizzBuzz.BUZZ, actual);
    }

    @Test
    public void give_15_it_should_be_return_FizzBuzz() {
        String actual = fizzBuzz.answer(15);

        Assert.assertEquals("FizzBuzz", actual);
    }
}
