package com.revature.repo;

import com.revature.services.account;

import java.util.List;

public interface DataDAO {

    /**
     * DAO
     * @return
     */

    /**
     * CREATE
     */
    void insertData(account myAcc);

    /**
     * READ
     */
    List<account> selectAllData();

    /**
     * UPDATE
     */
    void updateAccount(account myAcc);
    void updateName(account myAcc, String name);

    /**
     * DELETE
     */
    void deleteAccount(account myAcc);
}
