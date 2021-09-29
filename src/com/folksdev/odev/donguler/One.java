package com.folksdev.odev.donguler;

public class One {
    public static void main(String[] args) {
        System.out.println("######## For Loop ########");
        /* For  */
        for (int i = 1; i <= 6; i++) {
            System.out.println("*".repeat(i));
        }

        System.out.println("######## While Loop ########");
        /* While */
        int counter = 1;

        while (counter <= 6) {
            System.out.println("*".repeat(counter));
            counter++;
        }
    }
}
