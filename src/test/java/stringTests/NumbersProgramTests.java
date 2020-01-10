package stringTests;


import numberPrograms.NumberPrograms;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class NumbersProgramTests {
    NumberPrograms numberPrograms= new NumberPrograms();

    @Test
    public void swapNumberUsingThirdVariable(){
        numberPrograms.swapTwoNumberUsingThirdVariable(10,20);
    }

    @Test
    public void swapNumberWithoutUsingThirdVariable(){
        numberPrograms.swapTwoNumberWithoutUsingThirdVariable(10,20);
    }

    @Test
    public void primeNumberTest(){
        Boolean aBoolean = numberPrograms.primeNumberCheck(5);
        Assert.assertTrue(aBoolean);
    }

    @Test
    public void fibonacciSeriesTest(){
        numberPrograms.fibonacciSeries(9);
    }

    @Test
    public void secondAndFirstMaxTest(){
        int[] number={34,23,45,456,34,5,4,399,999,4989};
        numberPrograms.secondMaxNumber(number);
    }

    @Test
    public void armstrongNumberTest(){
        Boolean aBoolean = numberPrograms.armstrongNumber(153);
        Assert.assertTrue(aBoolean);
    }

    @Test
    public void palindromeTest(){
        Boolean palindrome = numberPrograms.palindrome(10);
        Assert.assertTrue(palindrome);
    }

    @Test
    public void factorialTest(){
        int factorial = numberPrograms.factorial(8);
        Assert.assertEquals(factorial,40320);
    }
}
