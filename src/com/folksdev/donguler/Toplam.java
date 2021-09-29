package com.folksdev.donguler;

import java.util.Scanner;

/*
* While döngü deyimi içerisindeki girilen num değeri 0'a eşit olana kadar sum değişkeninde toplama yapıldı.
* */

public class Toplam {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Start entering numbers: ");

        int sum = 0;
        int num;

        while ((num = Integer.parseInt(input.nextLine())) != 0){
            sum += num;

            System.out.printf("Sum: %d%n", sum);
            System.out.print("Start entering numbers: ");
        }



    }
}
