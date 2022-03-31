package daos;


import java.util.List;

import models.Cheval;
import models.Course;
import models.Data;

public class ChevalDao {

	Data data;

		public static boolean createCheval(String name, int age) {
			return Data.getHippodrome().chevaux.add(new Cheval(name, age));
		}
		
		public void updateCheval(Cheval c, String name) {
			c.setName(name);
		}

		public boolean deleteCheval(Cheval c) {
			return data.getHippodrome().chevaux.remove(c);
		}

		public boolean deleteChevalByName(Cheval c, String name) {
			try{
				return data.getHippodrome().chevaux.remove(c.getName().equals(name));
			}
			catch(Exception e) {
				return false;
			}
		}

	public List<Cheval> getCheval(){
			return data.getHippodrome().chevaux;
	}

}

