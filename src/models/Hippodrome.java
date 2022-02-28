package models;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    List<Course> courses;
    String name;

    public Hippodrome() {
        courses = new ArrayList<Course>();
        name = "";
    }

    public Hippodrome(String name) {
        this();
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
