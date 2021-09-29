package com.folksdev.odev.donguler;

public class Two {
    public static void main(String[] args) {

        int count = 1;

        for (int i = 5; i >= 0; i--) {
            System.out.print(" ".repeat(i));
            for (int j = 1; j < count + 1; j++) {
                System.out.print(j);
            }
            count++;
            System.out.println();
        }

    }
}
