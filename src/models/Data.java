package models;

import java.util.List;

public class Data {


    static List<Hippodrome> hippodromes;

    public static List<Hippodrome> getHippodromes() {
        return hippodromes;
    }

    public static void setHippodromes(List<Hippodrome> hippodromes) {
        Data.hippodromes = hippodromes;
    }

}
