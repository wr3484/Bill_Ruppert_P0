package com.revature.models;

import java.util.Scanner;

public class WelcomeScreen
{

    public void printWelcomeScreen()
    {
        System.out.println("Welcome to your local bank, please follow the instructions below.");
        System.out.println("Press (1) to Login");
        System.out.println("Press (2) to create a New Account.");
        System.out.println("Press (0) to exit the program");
    }


    public void display() throws Exception
    {
        Scanner myScan = new Scanner(System.in);
        String temp = myScan.nextLine();
        switch (temp)
        {
            case "1":
                // Call the User Class to check credentials
                break;
            case "2":
                break;
            case "0":
                System.out.println("Exiting the Program. Goodbye.");
                System.exit(0);
                break;
            default:
                System.out.println("Please Enter 1, 2 or 0");
        }
    }
}

