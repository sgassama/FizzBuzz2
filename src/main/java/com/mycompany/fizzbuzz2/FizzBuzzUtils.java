/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fizzbuzz1;

/**
 *
 * @author siakagassama
 */
public class FizzBuzzUtils {

    public FizzBuzzUtils() {
    }

    public Boolean isNotFizzBuzz(Integer valueToCheck) {
        return !isFizz(valueToCheck) && !isBuzz(valueToCheck) && !isFizzBuzz(valueToCheck);
    }

    public String getFizzBuzzType(Integer valueToCheck) {
        String fizzBuzzType = null;
        
        if (isLucky(valueToCheck)) {
            fizzBuzzType = "Lucky";
        }
        else if (isFizzBuzz(valueToCheck)) {
            fizzBuzzType = "FizzBuzz";
        }
        else if (isBuzz(valueToCheck)) {
            fizzBuzzType = "Buzz";
        }
        else if (isFizz(valueToCheck)) {
            fizzBuzzType = "Fizz";
        }

        return fizzBuzzType;
    }

    private Boolean isLucky(Integer valueToCheck) {
        String numToString = valueToCheck.toString();
        return numToString.contains("3");
    }

    private Boolean isFizz(Integer valueToCheck) {
        return valueToCheck % 3 == 0;
    }

    private Boolean isBuzz(Integer valueToCheck) {
        return valueToCheck % 5 == 0;
    }

    private Boolean isFizzBuzz(Integer valueToCheck) {
        return valueToCheck % 15 == 0;
    }
}
