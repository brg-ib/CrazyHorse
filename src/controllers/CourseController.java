package controllers;

import daos.ChevalDao;
import daos.CourseDao;
import daos.HippodromeDao;
import models.Cheval;
import models.Course;
import models.Hippodrome;

public class CourseController {

    CourseDao cDao = new CourseDao();
    HippodromeDao hDao = new HippodromeDao();
    ChevalDao gDao = new ChevalDao();

    public String addChevalToCourse(Course c, Cheval g) {
        try
        {
            //sDao.addGroupeToScene(g, s);
        }
        catch(NullPointerException ex) {
            return "La course ou le cheval est null.";
        }
        return "";
    }

    public boolean createChevalAndAddToCourse(String hippodrome, String courseName, String chevalName) {
        Hippodrome h = hDao.getHippodromeByName(hippodrome);

        Course c = hDao.getCourseFromHippodromeByCourseName(h, courseName);

        Cheval g = gDao.createCheval(chevalName, 0,0);
        return cDao.createChevalToCourse(g, c);

    }

    public void printCourseFromHippodrome(Hippodrome hippodrome) {
        for (Course c : hippodrome.getCourses()) {
            System.out.println(c.getName());
        }
    }

    public boolean deleteChevalFromCourse(String hippodromeName, String courseName, String chevalName) {
        Hippodrome f = hDao.getHippodromeByName(hippodromeName);
        Course c = hDao.getCourseFromHippodromeByCourseName(f, courseName);
        Cheval g = cDao.getChevalFromCourseByCourseName(c, chevalName);
        return cDao.deleteChevalFromCourse(g, c);
    }


}
