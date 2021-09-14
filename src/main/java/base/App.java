package base;
import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Kenny Dao
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.print("What is the principal amount? ");
        Scanner p_amount = new Scanner(System.in);
        int principal_amount = p_amount.nextInt();
        15
        System.out.print("What is the rate? ");
        Scanner rte = new Scanner(System.in);
        double rate = rte.nextDouble();

        System.out.print("What is the number of years? ");
        Scanner num_year = new Scanner(System.in);
        int year = num_year.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        Scanner com = new Scanner(System.in);
        int compound = com.nextInt();

        double result = principal_amount * Math.pow(1 + ((rate * 0.01) / compound ), compound * year);
        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n", principal_amount, rate, year, compound, result);

    }
}