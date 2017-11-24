package com.company;

public class Main {

    public static void main(String[] args) {
        for (long i = 121; i < 130; i++) {
            if (checkNumberIsPrime(i)==true) {
                System.out.println(i);
            }
        }
    }

    public static boolean checkNumberIsPrime(long number) {
        boolean indicator=true;
        for (long j = 2; j < number; j++) {
            if (number % j == 0) {
                indicator=false;
                break;
            }
        }
        return indicator;
    }
}


