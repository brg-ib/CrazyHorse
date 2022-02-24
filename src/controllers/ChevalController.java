package controllers;

import daos.ChevalDao;
import models.Cheval;

public class ChevalController {

	ChevalDao chevalDao;
	
	public ChevalController() {
		chevalDao = new ChevalDao();
	}
	
	public Cheval createCheval(String name, int age, int nbVictoire) {
		if(name == null)
			return null;
		return chevalDao.createCheval(name, age, nbVictoire);
	}
}
