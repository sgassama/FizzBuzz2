/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fizzbuzz2;

/**
 *
 * @author siakagassama
 */
public class Main {

    public static void main(String[] args) {

        FizzBuzzUtils fizzBuzzUtils = new FizzBuzzUtils();

        int n = 20;

        for (int i = 1; i <= n; i++) {
            if (fizzBuzzUtils.isNotFizzBuzz(i)) {
                System.out.print(i + "\n");
            
            } else {
                FizzBuzzFactory fizzBuzzFactory = new FizzBuzzFactory();
                Fizz_Buzz_Or_FizzBuzzer fizzBuzzer = fizzBuzzFactory
                        .getFizzBuzzer(fizzBuzzUtils.getFizzBuzzType(i));
                System.out.print(fizzBuzzer.value() + "\n");
            }

        }

    }
}
