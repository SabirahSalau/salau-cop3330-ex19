/*
 *  UCF COP3330 Summer 2021 Assignment 19 Solution
 *  Copyright 2021 Sabirah Salau
 */


package org.example;

import java.util.Scanner;

public class Problem19
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your height in inches:");
        String height = input.nextLine();

        while(!height.matches("[0-9]+"))
        {
            System.out.println("Please enter numerical values only:");
            height = input.next();
        }


        System.out.println("Enter your weight in pounds:");
        String weight = input.next();

        while(!weight.matches("[0-9]+"))
        {
            System.out.println("Please enter numerical values only:");
            weight = input.next();
        }

        double dHeight = Double.parseDouble(height);
        double dWeight = Double.parseDouble(weight);
        double BMI = (dWeight/(dHeight * dHeight)) * 703;

        if(BMI >= 18.5 && BMI <= 25)
        {
            System.out.printf("Your BMI is:%.2f.\nYour are within the ideal weight range.", BMI);
            System.exit(0);
        }
        else if (BMI < 18.5)
        {
            System.out.printf("Your BMI is:%.2f.\nYour are underweight. You should see a doctor.", BMI);
            System.exit(0);
        }
        else if (BMI > 25)
        {
            System.out.printf("Your BMI is:%.2f.\nYou are overweight. You should see a doctor.", BMI);
            System.exit(0);
        }





    }

}
