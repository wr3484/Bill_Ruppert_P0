package com.revature.models;

public class User {
    //    public void newUserRegistration();
//    public void checkAccountBalance();
//    public void login();
//    public void depositFunds();
//    public void withdrawFunds();
//    public void viewTransactionHistory();
//    public void transferMoney();
//    public void multipleUsers();
//    public void shareAccount();
    private int userId;
    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;

    /**
     * No Args Constructor
     */
    public User() {

    }

    /**
     * All Arg Constructor
     * @param userId
     * @param firstName
     * @param lastName
     * @param userName
     * @param passWord
     */
    public User(int userId, String firstName, String lastName, String userName, String passWord) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.passWord = passWord;
    }

    /**
     * To String Method
     * @return
     */
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    /**
     * Getters and Setters
     * @return
     */
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


    /**
     *  USER METHODS
     */
   // public void login()



}

