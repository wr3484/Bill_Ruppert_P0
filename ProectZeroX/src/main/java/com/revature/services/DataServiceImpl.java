package com.revature.services;

import com.revature.repo.DataDAO;

import java.util.List;

public class DataServiceImpl implements DataService{
    /**
     * THIS CLASS WILL:
     * VERIFY CREDENTIALS
     * AUTHORIZE USERS
     * FILTERING
     */

    private DataDAO myDAO;

    @Override
    public List<account> getAccount() {
        // TODO Auto-generated method stub
        List<account> accountList = myDAO.selectAllData();

        return accountList;
    }
}
