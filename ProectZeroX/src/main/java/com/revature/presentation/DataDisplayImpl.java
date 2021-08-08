package com.revature.presentation;

import com.revature.services.DataService;
import com.revature.services.account;

import java.util.List;
import java.util.Scanner;

public class DataDisplayImpl implements DataDisplay{

    /**
     * This class will query tables from the database and show the results
     */
    private DataService service;

    public DataDisplayImpl(DataService service){
        super();
        this.service = service;
    }

    @Override
    public void displayAccount() {
        List<account> accountList = service.getAccount();

        System.out.println("List of Account Users: ");

        for(account p : accountList) {
            System.out.println("Email Address: " + p.geteMail());
            System.out.println("Password: " + p.getPassWord()) ;
        }
    }

    @Override
    public void windowMenu() {
            System.out.println("Welcome to your local bank, please follow the instructions below.");
            System.out.println("Press (1) to Login");
            System.out.println("Press (2) to create a New Account.");
            System.out.println("Press (0) to exit the program");
        }

    @Override
    public void userChoice(){

            Scanner myScan = new Scanner(System.in);
            String temp = myScan.nextLine();
            switch (temp)
            {
                case "1":
                    // Call the User Class to check credentials
                    break;
                case "2":
                    // Call the User Class to initiate newUser information input
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
