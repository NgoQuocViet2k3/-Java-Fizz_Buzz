package com.codegym;

public class FizzBuzzTest {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public static String FizzBuzz(int number) {
        boolean chiaHetCho3 = number % 3 == 0;
        boolean chiaHetCho5 = number % 5 == 0;
        boolean chiaHetcho15 = number % 15 == 0;
        if (chiaHetcho15) {
            return FIZZ_BUZZ;
        } else if (chiaHetCho3) {
            return FIZZ;
        } else {
            if (chiaHetCho5) {
                return BUZZ;

            }

        }

        return number + "";
    }
}