package controllers;

import daos.HippodromeDao;
import models.Cheval;
import models.Course;
import models.Data;
import models.Hippodrome;

public class HippodromeController {

    HippodromeDao hippodromeDao;
    ChevalController chevalController;
    CourseController courseController;

    public HippodromeController() {
        hippodromeDao = new HippodromeDao();
        chevalController = new ChevalController();
        courseController = new CourseController();
    }

    public void createHippodrome(String name) {
        Hippodrome h = new Hippodrome(name);
        hippodromeDao.addHippodromeToList(h);
    }

    public boolean deleteHippodromeByName(String name) {
        Hippodrome hippodrome = hippodromeDao.getHippodromeByName(name);
        if(hippodrome == null)
            return false;
        hippodromeDao.deleteHippodromeToList(hippodrome);
        return true;
    }

    public void printHippodrome() {
        for(Hippodrome f : Data.getHippodromes()) {
            System.out.println(f.getName());
        }
    }

    public boolean createCourseAndAddToHippodrome(String hippodromeName,String courseName) {
        Hippodrome hippodrome = hippodromeDao.getHippodromeByName(hippodromeName);
        if(hippodrome == null) {
            return false;
        }
        Course c = new Course(courseName);
        return hippodromeDao.addCourseToHippodrome(c, hippodrome);
    }

    public boolean deleteCourseFromHippodrome(String hippodromeName,String courseName) {
        Hippodrome hippodrome = hippodromeDao.getHippodromeByName(hippodromeName);
        if(hippodrome == null) {
            return false;
        }
        Course c = hippodromeDao.getCourseFromHippodromeByCourseName(hippodrome, courseName);
        if(c == null) {
            return false;
        }
        return hippodromeDao.deleteCourseFromHippodrome(c, hippodrome);
    }

    public boolean printAllCourseNameByHippodromeName(String hippodromeName) {
        Hippodrome hippodrome = hippodromeDao.getHippodromeByName(hippodromeName);
        if(hippodrome == null) {
            return false;
        }
        System.out.println("Voici les courses de l'hippodrome : ");
        for(Course c : hippodrome.getCourses()) {
            System.out.println(c.getName());
        }
        return true;
    }

    public boolean updateHippodromeName(String oldHippodromeName,String newHippodromeName) {
        if(hippodromeDao.getHippodromeByName(newHippodromeName) != null) {
            return false;
        }
        Hippodrome hippodrome = hippodromeDao.getHippodromeByName(oldHippodromeName);
        if(hippodrome == null) {
            return false;
        }
        hippodromeDao.updateHippodromeName(hippodrome, newHippodromeName);
        return hippodrome.getName().equals(newHippodromeName);
    }

    public String createChevalAndAddChevalInCourseSelectedToHippodromeSelected(String hippodromeName,String courseName, String chevalName, int age, int nbVictoire) {
        Hippodrome hippodrome = hippodromeDao.getHippodromeByName(hippodromeName);
        if(hippodrome == null) {
            return "L'hippodrome n'a pas ete trouve.";
        }
        Course c = hippodromeDao.getCourseFromHippodromeByCourseName(hippodrome, courseName);
        if(c == null) {
            return "La course n'a pas ete trouve.";
        }
        Cheval g = chevalController.createCheval(chevalName, age, nbVictoire);
        if(g == null) {
            return "La creation du cheval n'a pas pu etre faite.";
        }
        return courseController.addChevalToCourse(c, g);
    }

    public void printAllCourse() {
        for (Hippodrome hippodrome : hippodromeDao.getHippodrome()) {
            for (Course c : hippodrome.getCourses()) {
                System.out.println(c.getName());
            };
        }
    }

    public Hippodrome getHippodromeByName(String hippodromeName) {
        return hippodromeDao.getHippodromeByName(hippodromeName);
    }
}
