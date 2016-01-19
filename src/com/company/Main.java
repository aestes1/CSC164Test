package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declaring variables
        double heightOfRectangle;
        double widthOfRectangle;

        //Get user to input variables
        //Scanner can be named anything like "thing"
        Scanner thing = new Scanner(System.in);

        //Prompts user to enter height
        //System.out.println(); makes user to enter variable next to line
        //System.out.print(); makes user to enter variable in next line
        System.out.print("Please enter the height of your rectangle: ");

        //User input for height
        heightOfRectangle = thing.nextDouble();

        //Prompts user to input width
        System.out.print("Please enter the width of your rectangle: ");

        //User input for width
        widthOfRectangle = thing.nextDouble();

        //Print the area
        System.out.println("The area is: " + (heightOfRectangle * widthOfRectangle));

        //Print the perimeter
        System.out.println("The perimeter is: " + (2 * heightOfRectangle + 2 * widthOfRectangle));
    }
}
