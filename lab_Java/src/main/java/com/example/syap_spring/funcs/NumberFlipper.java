package com.example.syap_spring.funcs;

public class NumberFlipper {   // lật ngược số
    public static void main(String[] args) {
        int numberToFlip = 46548;
        int flippedNumber = flipNumber(numberToFlip);
        System.out.println("Original Number: " + numberToFlip);
        System.out.println("Flipped Number: " + flippedNumber);
    }

    public static int flipNumber(int number) {
        boolean isNegative = number < 0;
        if (isNegative) {
            number = -number;
        }

        int reversedNumber = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ignored) {}
        return isNegative ? -reversedNumber : reversedNumber;
    }
}

