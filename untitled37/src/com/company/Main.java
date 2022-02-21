package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

 */
        int total=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("The number: ");
        int number= inp.nextInt();

        for(int i=1;i<number;i++) {

            if (number % i == 0) {
                total += i;
            } }
            if(total==number){

                System.out.print("It's a perfect number. "); }
                else
            System.out.print("It's NOT a perfect number.");


        } }
