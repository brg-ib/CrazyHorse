package models;
import utils.Utilitaire;

import java.util.ArrayList;
import java.util.List;

public class Cheval{

    static String name;
    static int age;
    static int nbVictoire;
	static int cmp = 0;

	List<Course> courses;

	Utilitaire u;


	public Cheval(){
		this.name = "Horse"+cmp++;
		this.age = u.getRandomNumberInRange(1,20);
		this.courses = new ArrayList<Course>();
		this.nbVictoire = 0;
	}

	public Cheval(String name, int age){
		this.name = name;
		this.age = age;
		this.courses = new ArrayList<Course>();
		this.nbVictoire = 0;
	}

	public static String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getNbVictoire() {
		return nbVictoire;
	}

	public void setNbVictoire(int nbVictoire) {
		this.nbVictoire = nbVictoire;
	}

	public List<Course> getCourses() {
		return courses;
	}
	public void setCourse(List<Course> courses) {
		this.courses = courses;
	}
}

