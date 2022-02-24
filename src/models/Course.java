package models;

import java.util.Date;
import java.util.List;

public class Course {

    String nom;
    Date date;
    static List<Cheval> cheval;

    public Course(String nom, Date date){
        this.nom = nom;
        this.date = date;
    }
}
