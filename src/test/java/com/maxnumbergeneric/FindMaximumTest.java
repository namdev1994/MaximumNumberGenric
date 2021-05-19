package com.maxnumbergeneric;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaximumTest {
    @Test
    public void firstNumberIntegerTest()// positive test for maximum first number
    {
        Integer maximum = (Integer)new FindMaximum(12, 9, 4,7,11).findMaximum();//pass the method parammetr to check
        Assertions.assertEquals(12,maximum);
    }
    @Test
    public void secondNumberIntegerTest()//  test for maximum number at second
    {
        Integer maximum =(Integer) new FindMaximum(12, 14, 4,2,7).findMaximum();//pass the method parammetr to check
        Assertions.assertEquals(14,maximum);
    }
    @Test
    public void thirdNumberIntegerTest()// test for maximum number at third
    {
        Integer maximum =(Integer) new FindMaximum(12, 9, 17,7,14).findMaximum();
        Assertions.assertEquals(17,maximum);
    }
    @Test
    public void maximumFirstNumberFloat() //float check test
    {
        float maximumFLoat = (Float)new FindMaximum(334.1f,212.1f,333.2f,121.1f,125.2f).findMaximum();
        Assertions.assertEquals(334.1f,maximumFLoat);
    }
    @Test
    public void maximumSecondNumberFloat() //float check test
    {
        float maximumFLoat = (Float) new FindMaximum(314.1f,444.1f,333.2f,215.3f,235.3f).findMaximum();
        Assertions.assertEquals(444.1f,maximumFLoat);
    }
    @Test
    public void maximumThirdNumberFloat() //float check test
    {
        float maximumFLoat = (Float)new FindMaximum(314.1f,212.1f,336.2f,156.1f,155.3f).findMaximum();
        Assertions.assertEquals(336.2f,maximumFLoat);
    }
    @Test
    public void maximumFirstStringTest() //test case for String  maximum
    {
        String maximumString = (String)new FindMaximum("Watermelon","Banana","Apple","Orange","Kiwi").findMaximum();
        Assertions.assertEquals("Watermelon",maximumString);

    }
    @Test
    public void maximumSecondStringTest() // test case for String  maximum
    {
        String maximumString=(String) new FindMaximum("Banana","Watermelon","Apple","Orange","Kiwi").findMaximum();
        Assertions.assertEquals("Watermelon",maximumString);
    }
    @Test
    public void maximumThirdStringTest() // test case for String  maximum
    {
        String maximumString =(String) new FindMaximum("Banana","Apple","Watermelon","Kiwi","Orange").findMaximum();
        Assertions.assertEquals("Watermelon",maximumString);
    }

}
