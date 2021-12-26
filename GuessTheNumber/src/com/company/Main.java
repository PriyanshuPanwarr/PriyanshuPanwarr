package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a = Math.round(Math.random() * 20);
        double b = Math.round(Math.random() * 50);
        double c = Math.round(Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose difficulty: press: 1-Easy / 2-Medium / 3-Hard");
        int lvl = sc.nextInt();
        int count = 0;
        while (true) {
            if (lvl == 1) {
                System.out.println("Guess the number between 0-20 (You have three chance)");
                int first = sc.nextInt();
                if (a == first) {
                    System.out.println("Correct Answer...you won");
                    break;
                } else {
                    System.out.println("nope...think again");
                    count++;
                    if (count == 3) {
                        System.out.println("OOps...better luck next time :) Answer= "+a);
                        break;
                    }
                }

            }
            if (lvl == 2) {
                System.out.println("Guess the number between 0-50");
                int second = sc.nextInt();
                if (b == second) {
                    System.out.println("Correct Answer...you won");
                    break;
                } else {

                System.out.println("nope...think again");
                count++;
                if (count == 3) {
                    System.out.println("OOps...better luck next time :) Answer= "+b);
                    break;
                }
                }
            }
            if (lvl == 3) {
                System.out.println("Guess the number between 0-100");
                int third = sc.nextInt();
                if (c == third) {
                    System.out.println("Correct Answer...you won");
                    break;
                } else {
                    System.out.println("nope...think again");
                    count++;
                    if (count == 3) {
                        System.out.println("OOps...better luck next time :) Answer= "+c );

                    }
                }
            }
        }
    }
}
