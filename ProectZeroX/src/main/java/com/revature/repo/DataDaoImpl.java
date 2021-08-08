package com.revature.repo;

import com.revature.Util.ConnectionFactory;
import com.revature.services.account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        return null;
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
