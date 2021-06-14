/*
 *  UCF COP3330 Summer 2021 Assignment 29 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean error = true;
        System.out.print("What is the rate of return? ");
        int rate;
        while (error) {
            rate = input.nextInt();
            if (rate > 0) {
                int years = 72 / rate;
                System.out.printf("It will take %d years to double your initial investment.", years);
                error = false;
            }
            else {
                System.out.print("Sorry. that's not a valid input.\nWhat is the rate of return? ");
            }
        }
    }
}
