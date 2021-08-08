package com.revature.repo;

import com.revature.Util.ConnectionFactory;
import com.revature.services.account;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataDaoImpl implements DataDAO{

    @Override
    public void insertData(account myAcc) {

        try {
            Connection connection = ConnectionFactory.getConnection();
            String sql = "insert into account " +
                    "values (?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,myAcc.geteMail());
            ps.execute();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    @Override
    public List<account> selectAllData() {
        List<account> customersList = new ArrayList<>();

            try {
                Connection connection = ConnectionFactory.getConnection();
                customersList = new ArrayList<>();
                String sql = "select * from account";
                Statement s = connection.createStatement();
                ResultSet rs = s.executeQuery(sql);
                while (rs.next()) {
                    customersList.add(
                            new account(
                                    rs.getString(1),
                                    rs.getString(2)
                            )
                    );
                }
                System.out.println(customersList);

            }
            catch (SQLException throwables) {
                throwables.printStackTrace();
            }



        return customersList;
    }

    @Override
    public void updateAccount(account myAcc) {

    }

    @Override
    public void updateName(account myAcc, String name) {

    }

    @Override
    public void deleteAccount(account myAcc) {

    }
}
