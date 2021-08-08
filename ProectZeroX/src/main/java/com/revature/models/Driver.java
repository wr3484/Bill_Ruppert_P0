package com.revature.models;


import com.revature.Util.ConnectionFactory;
import com.revature.presentation.DataDisplay;
import com.revature.presentation.DataDisplayImpl;
import com.revature.repo.DataDAO;
import com.revature.repo.DataDaoImpl;
import com.revature.services.*;


import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class Driver
{
    private static Connection myConnect;
    //Connection myConnect;


    public static void main(String args[]) throws Exception {
        DataDAO myDAO = new DataDaoImpl();
        DataService myService = new DataServiceImpl(myDAO);
        DataDisplay myDisplay = new DataDisplayImpl(myService);

        myDisplay.windowMenu();
        myDisplay.displayAccount();
        //System.out.println(myDAO.selectAllData());
    }

        //WelcomeScreen w1 = new WelcomeScreen();
        //w1.printWelcomeScreen();
        //while (true) {
        //    w1.display();
        //}

//        {
//            try {
//                myConnect = ConnectionFactory.getConnection();
//                List<account> customersList = new ArrayList<>();
//                String sql = "select * from account";
//                Statement s = myConnect.createStatement();
//                ResultSet rs = s.executeQuery(sql);
//                while(rs.next()){
//                    customersList.add(
//                            new account(
//                                rs.getString(1),
//                                    rs.getString(2)
//                            )
//                    );
//                }
//                System.out.println(customersList);
//            }
//            catch (SQLException throwables) {
//                throwables.printStackTrace();
//            }
//        }
//    }



}