package com.industriallogic.collections;

import org.junit.Assert;
import org.junit.Test;

public class ListTest {

    @Test
    public void testConstructor(){
        new List();
    }

    @Test
    public void testAddList(){
        List list = new List();
        list.add(null);
        list.add("");
    }

    @Test
    public void testSize(){
        List list = new List();
        list.add("");

        Assert.assertEquals(list.size(), 1);
    }

    @Test
    public void testAddElement(){
        List list = new List();
        list.add("abc");

        Assert.assertEquals(list.get(0), "abc");
    }

    @Test
    public void testCapacity(){
        List list = new List();
        Assert.assertEquals(10, list.capacity());

        list.add("1");
        Assert.assertEquals(10, list.capacity());

        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        Assert.assertEquals(10, list.capacity());
        list.add("11");
        list.add("12");
        list.add("13");
        Assert.assertEquals(20, list.capacity());
        list.add("14");
        list.add("15");
        list.add("16");
        list.add("17");
        list.add("18");
        list.add("19");
        list.add("20");
        Assert.assertEquals(20, list.capacity());
        list.add("21");
        Assert.assertEquals(30, list.capacity());
    }

    @Test
    public void testReadOnly(){
        List list = new List();

        list.setReadOnly(true);

        list.add("abc");

        Assert.assertEquals(0, list.size());

        list.setReadOnly(false);
        list.add("abc");
        Assert.assertEquals(1, list.size());
    }


}
