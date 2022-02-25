package daos;

import java.util.ArrayList;
import java.util.List;

import models.Course;
import models.Data;
import models.Hippodrome;

public class HippodromeDao {

    Hippodrome h1;

    public HippodromeDao() {
        h1 = new Hippodrome();
        Data.setHippodromes(new ArrayList<Hippodrome>());
    }

    public boolean addHippodromeToList(Hippodrome h) {
        return Data.getHippodromes().add(h);
    }

    public boolean deleteHippodromeToList(Hippodrome h) {
        return Data.getHippodromes().remove(h);
    }

    public List<Hippodrome> getHippodrome(){
        return Data.getHippodromes();
    }

    public void setHippodrome(List<Hippodrome> hippodromes) {
        Data.setHippodromes(hippodromes);
    }

    public boolean addCourseToHippodrome(Course course, Hippodrome hippodrome) {
        return hippodrome.getCourses().add(course);
    }

    public Hippodrome getHippodromeByName(String nameHippodrome) {
        Hippodrome hippodrome = null;
        for(Hippodrome h : getHippodrome()) {
            if(h.getName().equals(nameHippodrome)) {
                hippodrome = h;
            }
        }
        return hippodrome;
    }

    public boolean deleteCourseFromHippodrome(Course course, Hippodrome hippodrome) {
        return hippodrome.getCourses().remove(course);
    }

	/*public List<Scene> getAllSceneFromFestival(String festivalName) {
		return null;
	}*/

    public Course getCourseFromHippodromeByCourseName(Hippodrome h,String courseName) {
        Course course = null;
        if(h == null)
            return null;
        for(Course c : h.getCourses()) {
            if(c.getName().equals(courseName)) {
                course = c;
            }
        }
        return course;
    }

    public void updateHippodromeName(Hippodrome hippodrome, String newHippodromeName) {
        hippodrome.setName(newHippodromeName);
    }


}
