/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
import java.util.Scanner;

public class Currency_Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many euros are you exchanging?");
        double euros = input.nextDouble();
        System.out.println("What is the exchange rate?");
        double rate = input.nextDouble();
        double dollars = euros*rate;
        String output = String.format("%.2f euros at an exhange rate of %.4f is %.2f U.S. dollars.",
                                        euros, rate, dollars);
        System.out.println(output);


    }
}
