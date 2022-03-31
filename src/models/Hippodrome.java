package models;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    String name;
    public List<Cheval> chevaux;
    public List<Course> courses;

    public Hippodrome(String name) {
        this.name = name;
        this.chevaux = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
