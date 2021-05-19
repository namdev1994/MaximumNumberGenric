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
    public void secondNumberIntegerTest()// positive test for maximum number
    {
        FindMaximum findMaximum = new FindMaximum();
        Integer maximum = findMaximum.findMaximum(12, 14, 4);//pass the method parammetr to check
        Assertions.assertEquals(14,maximum);
    }
    @Test
    public void thirdNumberIntegerTest()//negative test
    {
        FindMaximum findMaximum = new FindMaximum();
        Integer maximum = findMaximum.findMaximum(12, 9, 17);
        Assertions.assertEquals(17,maximum);
    }
    @Test
    public void maximumFirstNumberFloat() //float check test
    {
        FindMaximum findMaximum = new FindMaximum();
        float maximumFLoat = findMaximum.findMaximum(334.1f,212.1f,333.2f);
        Assertions.assertEquals(334.1f,maximumFLoat);
    }
    @Test
    public void maximumSecondNumberFloat() //float check test
    {
        FindMaximum findMaximum = new FindMaximum();
        float maximumFLoat = findMaximum.findMaximum(314.1f,444.1f,333.2f);
        Assertions.assertEquals(444.1f,maximumFLoat);
    }
    @Test
    public void maximumThirdNumberFloat() //float check test
    {
        FindMaximum findMaximum = new FindMaximum();
        float maximumFLoat = findMaximum.findMaximum(314.1f,212.1f,336.2f);
        Assertions.assertEquals(336.2f,maximumFLoat);
    }
    @Test
    public void maximumFirstStringTest() //test case for String check
    {
        FindMaximum findMaximum = new FindMaximum();
        String maximumString = findMaximum.findMaximum("Watermelon","Banana","Apple");
        Assertions.assertEquals("Watermelon",maximumString);

    }
    @Test
    public void maximumSecondStringTest()
    {
        FindMaximum findMaximum = new FindMaximum();
        String maximumString = findMaximum.findMaximum("Banana","Watermelon","Apple");
        Assertions.assertEquals("Watermelon",maximumString);
    }
    @Test
    public void maximumThirdStringTest()
    {
        FindMaximum findMaximum = new FindMaximum();
        String maximumString = findMaximum.findMaximum("Banana","Apple","Watermelon");
        Assertions.assertEquals("Watermelon",maximumString);
    }

}
