package com.codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFizzBuzz {


    @Test
    public void TestInputThreeFizz(){
        int inputNumber =3;
        String expected = FizzBuzzTest.FIZZ;
        String actual = FizzBuzzTest.FizzBuzz(inputNumber);
        assertEquals(expected, actual);

    }
    @Test
    public void TestInputFiveBuzz(){
        int inputNumber =5;
        String expected = FizzBuzzTest.BUZZ;
        String actual = FizzBuzzTest.FizzBuzz(inputNumber);
        assertEquals(expected,actual);
    }
    @Test
    public void TestInputFifteenFizzBuzz(){
        int inputNumber = 15;
        String expected = FizzBuzzTest.FIZZ_BUZZ;
        String actual = FizzBuzzTest.FizzBuzz(inputNumber);
        assertEquals(expected,actual);
    }
    @Test
    public void TestInputNumber(){
        String expected = FizzBuzzTest.FizzBuzz(11);
        String actual = FizzBuzzTest.FizzBuzz(11);
        assertEquals(expected,actual);
    }
}
