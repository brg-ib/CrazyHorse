package daos;


import models.Cheval;
import models.Course;
import models.Hippodrome;

import java.util.List;

public class CourseDao {

    public boolean createChevalToCourse(Cheval cheval, Course course) {
        if (cheval == null) {
            return false;
        }
        try {
            course.getCheval().add(cheval);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean deleteChevalFromCourse(Cheval cheval, Course course) {
        try {
            return course.getCheval().remove(cheval);
        } catch (Exception e) {
            return false;
        }
    }

    public List<Course> getAllCourseFromHippodrome(Hippodrome h) {
        return h.getCourses();
    }

    public Cheval getChevalFromCourseByCourseName(Course c, String courseName) {
        Cheval cheval = null;
        if (c == null)
            return null;
        for (Cheval g : c.getCheval()) {
            if (g.getName().equals(courseName)) {
                cheval = g;
            }
        }
        return cheval;
    }
}
