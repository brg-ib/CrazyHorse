package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Course {

    static String name;
    static Date date;
    List<Cheval> chevaux;
    static Cheval gagnant;

    public Course() {
        chevaux = new ArrayList<Cheval>();
        gagnant = new Cheval();
    }

    public Course(String nom){
        this.name = nom;
        chevaux = new ArrayList<Cheval>();
        gagnant = new Cheval();
    }

    public Course(String name, Date date, Cheval gagnant) {
        this.name = name;
        this.date = date;
        this.gagnant = gagnant;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public List<Cheval> getChevalList() {
        return chevaux;
    }

    public Cheval getGagnant(){
        return gagnant;
    }
    public void setGagnant(Cheval gagnant){ this.gagnant = gagnant;}
}
