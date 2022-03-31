package daos;


import java.util.List;

import models.Cheval;
import models.Course;
import models.Data;
import org.jetbrains.annotations.NotNull;

public class ChevalDao {

	Data data;

		public static boolean createCheval(String name, @NotNull int age) {
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


	public Cheval getFirstCheval(String name) {
		List<Cheval> chevaux = data.getHippodrome().chevaux;
		for (int i = 0; i < chevaux.size(); i++) {
			if (chevaux.get(i).getName().equals(name)) {
				return chevaux.get(i);
			}
		}
		return null;
	}

	public List<Cheval> getCheval(){
			return data.getHippodrome().chevaux;
	}


}

