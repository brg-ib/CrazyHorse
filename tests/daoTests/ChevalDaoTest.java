import daos.ChevalDao;
import daos.HippodromeDao;
import models.Cheval;
import models.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

public class ChevalDaoTest {

    ChevalDao chevalDao = new ChevalDao();
    HippodromeDao hippodromeDao = new HippodromeDao();


    @BeforeEach
    void init() {
        hippodromeDao = new HippodromeDao();
        chevalDao = new ChevalDao();
    }

    @Test
    void getChevauxTest() {
        assertNotNull(chevalDao.createCheval("Pepsi", 10));
    }
    @Test
    void createChevalTest() {
        assertNotNull(chevalDao.createCheval("Pepsi", 10));
    }

    @Test
    void updateChevalTest() {
        Cheval cheval = new Cheval("Coca", 10);
        chevalDao.updateCheval(cheval, "Pepsi");
        assertEquals(cheval.getName(), "Pepsi");
    }

    @Test
    void addChevalToCourseTest() throws ParseException {
        Course course = new Course("Coursy");
        Cheval chev = new Cheval("Rodolph", 10);
        //assertTrue(chevalDao.(course, chev));
    }


}
