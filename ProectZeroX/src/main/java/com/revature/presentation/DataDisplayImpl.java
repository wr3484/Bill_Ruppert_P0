package com.revature.presentation;

import com.revature.services.DataService;
import com.revature.services.account;

import java.util.List;

public class DataDisplayImpl implements DataDisplay{

    /**
     * This class will query tables from the database and show the results
     */
    private DataService service;



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
        // TODO Auto-generated method stub

    }
}
