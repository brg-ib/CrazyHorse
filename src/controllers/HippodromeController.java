package controllers;

import daos.HippodromeDao;
import models.Hippodrome;

public class HippodromeController {

    HippodromeDao hDao = new HippodromeDao();

    public Hippodrome getHippodrome() {
        return hDao.hippodrome;
    }

    public String getHippodromeName() {
        return hDao.getName();
    }

    public void setHippodromeName(String name) {
        hDao.setName(name);
    }
}
