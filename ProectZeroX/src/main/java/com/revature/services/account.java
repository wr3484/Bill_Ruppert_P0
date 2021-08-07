package com.revature.services;

import com.revature.Util.ConnectionFactory;

import java.beans.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;

public class account {

    private String eMail;
    private String passWord;





    public account() {
    }

    public account(String eMail, String passWord) {
        this.eMail = eMail;
        this.passWord = passWord;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
