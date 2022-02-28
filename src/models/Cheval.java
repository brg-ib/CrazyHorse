package models;

public class Cheval {

    String name;
    int age;
    int nbVictoire;

    public Cheval(String name, int age, int nbVictoire){
        this.name = name;
        this.age = age;
        this.nbVictoire = nbVictoire;
    }

	public Cheval(String name, int age){
		this.name = name;
		this.age = age;
		this.nbVictoire = nbVictoire;
	}
    
	public Cheval(String string) {
		name = string;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
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
}

