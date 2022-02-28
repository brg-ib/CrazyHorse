package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Course {

    String name;
    Date date;
    static List<Cheval> cheval;

    public Course() {
        cheval = new ArrayList<Cheval>();
        name = "";
    }

    public Course(String nom){
        this.name = nom;
    }

    public Course(String nom, Date date){
        this.name = nom;
        this.date = date;
    }

    public List<Cheval> getCheval() {
        return cheval;
    }
    public void setCheval(List<Cheval> cheval) {
        this.cheval = cheval;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
