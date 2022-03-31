package daos;


import models.Cheval;
import models.Course;
import models.Data;
import models.Hippodrome;

import java.util.List;

public class CourseDao {


    public List<Course> getListCourses() {
        return Data.getHippodrome().courses;
    }

    public boolean addChevalToCourse(Course c, List<Cheval> chevaux) {
        if (chevaux.size() != 6) {
            return false;
        }

        for (Cheval cheval : chevaux) {
            cheval.getCourses().add(c);
        }
        return c.getChevalList().addAll(chevaux);
    }

    public boolean createCourse(String name) {
        return Data.getHippodrome().courses.add(new Course(name));
    }

    public void updateCourseName(Course c, String name) {
        c.setName(name);
    }

    public boolean deleteCourse(Course c) {
        return Data.getHippodrome().courses.remove(c);
    }

    public Course getFirstCourse(String name) {

        List<Course> courses = Data.getHippodrome().courses;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getName().equals(name)) {
                return courses.get(i);
            }
        }
        return null;
    }

}
