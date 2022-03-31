import daos.ChevalDao;
import daos.HippodromeDao;
import models.Cheval;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void createChevalTest() {
        assertNotNull(chevalDao.createCheval("Pepsi", 10));
    }

    @Test
    void updateChevalTest() {
        Cheval cheval = new Cheval("Coca", 10);
        chevalDao.updateCheval(cheval, "Pepsi");
        assertEquals(cheval.getName(), "Pepsi");
    }
}
