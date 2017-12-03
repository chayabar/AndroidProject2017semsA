package com.example.owner.android5778_3965_2493_00.model.backend;

import com.example.owner.android5778_3965_2493_00.model.datasource.List_DBManager;

/**
 * Created by owner on 26/11/2017.
 */

public class DBManagerFactory {
    static DB_manager manager = null;

    public static DB_manager getManager() {
        if (manager == null)
            manager = new List_DBManager(); //MySQL_DBManager();
        return manager;
    }
}
