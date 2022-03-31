import controllers.*;
import models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChevalControllerTest {

    ChevalController chevalController;
    HippodromeController hippodromeController;

    @BeforeEach
    void init() {
        chevalController = new ChevalController();
        hippodromeController = new HippodromeController();
    }

    @Test
    public void createChevalTest() {
        chevalController.createCheval("Queeny",12);
        assertEquals("Queeny", Cheval.getName());
        assertEquals(12, Cheval.getAge());
    }


    @Test
    public void updateNameChevalTest() {
        Cheval cheval = new Cheval("Queeny", 10);
        Data.getHippodrome().chevaux.add(cheval);
        chevalController.updateCheval(cheval, "realQueeny");
        assertEquals("realQueeny", Cheval.getName());
        assertEquals(10, Cheval.getAge());
    }

    @Test
    public void deleteChevalTest() {
        Cheval cheval = new Cheval("Queeny", 10);
        Data.getHippodrome().chevaux.add(cheval);
        assertTrue(chevalController.deleteCheval(cheval));
    }

    @Test
    public void deleteChevalWhenListIsEmptyTest() {
        Cheval cheval = new Cheval("Queeny", 10);
        assertFalse(chevalController.deleteCheval(cheval));
    }
}
