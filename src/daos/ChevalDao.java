package daos;


import java.util.List;

import models.Hippodrome;
import models.Cheval;
import models.Course;

public class ChevalDao {


		public Cheval createCheval(String name, int age, int nbVictoire) {
			return new Cheval(name,age,nbVictoire);
		}
		
		public boolean updateCheval(Cheval c, String string) {
			try{
				g.setName(string);
				return true;
			}
			catch(Exception e) {
				return false;
			}	
		}
		
		public List<Cheval> getAllChevalFromCourse(Course c){
			return c.getChevals();
		} 
	}


}
