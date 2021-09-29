package com.folksdev.odev.donguler;

public class Five {
    public static void main(String[] args) {

        long num1 = 1;
        long num2 = 1;

        for (int i = 1; i <= 500; ++i)
        {
            System.out.println(num1);

            long result = num1 + num2;
            num1 = num2;
            num2 = result;
        }

    }
}
