package com.folksdev.odev.donguler;

public class Three {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = i + 6; j >= 0; j--) {
                System.out.print(" ".repeat(j));
            }
        }
    }
}
