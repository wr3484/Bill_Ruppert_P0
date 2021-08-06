package com.revature.models;

import java.util.Scanner;
public class Driver
{

    public static void main(String args[]) throws Exception
    {
        WelcomeScreen w1 = new WelcomeScreen();
        w1.printWelcomeScreen();
        while(true)
        {
            w1.display();
        }



    }


}