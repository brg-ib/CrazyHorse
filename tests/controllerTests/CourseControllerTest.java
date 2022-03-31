import controllers.*;
import models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CourseControllerTest {

    HippodromeController hippodromeController;
    CourseController courseController;

    @BeforeEach
    void init() {
        courseController = new CourseController();
        hippodromeController = new HippodromeController();
    }

    @Test
    public void createCourseTest() {
        courseController.createCourse("Speedy");
        assertEquals("Speedy", Course.getName());
    }


    @Test
    public void updateCourseNameTest() {
        Course course = new Course("24h du Con");
        Data.getHippodrome().courses.add(course);
        courseController.updateCourseName(course,"24h du Mans");
        assertEquals("24h du Mans", Course.getName());
    }

    @Test
    public void deleteCourseTest() {
        Course course = new Course("CovidTour");
        Data.getHippodrome().courses.add(course);
        assertTrue(courseController.deleteCourse(course));
    }

    @Test
    public void deleteCourseWhenListIsEmptyTest() {
        Course course = new Course("CouscousCourse");
        assertFalse(courseController.deleteCourse(course));
    }

    @Test
    public void addChevalToCourseTest() {
        Course course = new Course("CouscousCourse");
        Data.getHippodrome().courses.add(course);
        List<Cheval> chevaux = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            chevaux.add(new Cheval());
        }
        for (int i = 0; i < Data.getHippodrome().courses.get(0).getChevalList().size(); i++)
            assertEquals(chevaux.get(i).getName(),Cheval.getName());
        assertTrue(courseController.addChevalToCourse(course,chevaux));

    }

    @Test
    public void addChevalToCourseMore6ChevauxTest() {
        Course course = new Course("CouscousCourse");
        Data.getHippodrome().courses.add(course);
        List<Cheval> chevaux = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            chevaux.add(new Cheval());
        }
        for (int i = 0; i < Data.getHippodrome().courses.get(0).getChevalList().size(); i++)
            assertEquals(chevaux.get(i).getName(),Cheval.getName());
        assertFalse(courseController.addChevalToCourse(course,chevaux));

    }
}
