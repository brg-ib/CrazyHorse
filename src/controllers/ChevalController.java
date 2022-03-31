package controllers;

import daos.ChevalDao;
import models.Cheval;
import models.Data;

import java.util.List;

public class ChevalController {

	ChevalDao chevalDao = new ChevalDao();

	public List<Cheval> getHippodrome() {
		return Data.getHippodrome().chevaux;
	}

	public void createCheval(String name, int age) {
		chevalDao.createCheval(name, age);
	}

	public void updateCheval(Cheval c, String name) {
		chevalDao.updateCheval(c, name);
	}

	public boolean deleteCheval(Cheval c) {
		return chevalDao.deleteCheval(c);
	}




}
