package com.maxnumbergeneric;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaximumTest {
    @Test
    public void firstNumberIntegerTest()// positive test for maximum number
    {
        FindMaximum findMaximum = new FindMaximum();
        Integer maximum = findMaximum.findMaximum(12, 9, 4);//pass the method parammetr to check
        Assertions.assertEquals(12,maximum);
    }
    @Test
    public void firstNumberFloatNegativeTest()//negative test
    {
        FindMaximum findMaximum = new FindMaximum();
        Integer maximum = findMaximum.findMaximum(12, 9, 4);
        Assertions.assertEquals(9,maximum);
    }
    @Test
    public void maximumNumberFloat() //float check test
    {
        FindMaximum findMaximum = new FindMaximum();
        float maximumFLoat = findMaximum.findMaximumFLoat(314.1f,212.1f,333.2f);
        Assertions.assertEquals(333.2f,maximumFLoat);
    }
    @Test
    public void maximumStringTest() //test case for String check
    {
        FindMaximum findMaximum = new FindMaximum();
        String maximumString = findMaximum.findMaximumString("Namdev","Mahadev","Sandip");
        Assertions.assertEquals("Sandip",maximumString);

    }
    @Test
    public void maximumStringNegativeTest()
    {
        FindMaximum findMaximum = new FindMaximum();
        String maximumString = findMaximum.findMaximumString("Namdev","Mahadev","Sandip");
        Assertions.assertEquals("Namdev",maximumString);
    }

}
