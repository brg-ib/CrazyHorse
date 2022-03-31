package controllers;

import daos.CourseDao;
import models.Cheval;
import models.Course;
import models.Data;

import java.util.List;

public class CourseController {

    CourseDao cDao = new CourseDao();


    public List<Course> getHippodrome() {
        return Data.getHippodrome().courses;
    }

    public void createCourse(String name) {
        cDao.createCourse(name);
    }

    public void updateCourseName(Course c, String name) {
        cDao.updateCourseName(c, name);
    }

    public boolean deleteCourse(Course c) {
        return cDao.deleteCourse(c);
    }

    public boolean addChevalToCourse(Course raceCircuit, List<Cheval> chevaux) {
        return cDao.addChevalToCourse(raceCircuit, chevaux);
    }

}
