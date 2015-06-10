package com.thoughtworks.factorial;

public class Factorial {
    public Integer compute(int i) {
        Integer fact = 1;
        if (i == 1 || i == 0) {
            return 1;
        } else if (i == 2) {
            return 2;
        } else if (i >= 3) {
            while (i > 1) {
                fact *= i;
                i--;
            }
            return fact;
        } else {
            throw new IllegalArgumentException();
        }
    }
}

