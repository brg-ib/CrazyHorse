package daos;

import java.util.ArrayList;
import java.util.List;

import models.Course;
import models.Data;
import models.Hippodrome;

public class HippodromeDao {

    public Hippodrome hippodrome = new Hippodrome("Hippodrome de Pigalle");

    public HippodromeDao(){
        Data.setHippodrome(hippodrome);
    }

    public String getName() {
        return hippodrome.getName();
    }

    public void setName(String name) {
        hippodrome.setName(name);
    }

}
