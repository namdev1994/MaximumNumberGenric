package com.maxnumbergeneric;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaximumTest {
    @Test
    public void firstNumberTest()// positive test for maximum number
    {
        FindMaximum findMaximum = new FindMaximum();
        Integer maximum = findMaximum.findMaximum(12, 9, 4);//pass the method parammetr to check
        Assertions.assertEquals(12,maximum);
    }
    @Test
    public void firstNumberNegativeTest()//negative test
    {
        FindMaximum findMaximum = new FindMaximum();
        Integer maximum = findMaximum.findMaximum(12, 9, 4);
        Assertions.assertEquals(9,maximum);
    }

}
