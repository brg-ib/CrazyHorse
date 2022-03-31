package models;

public class Data {

    static Hippodrome hippo;

    public static Hippodrome getHippodrome() {
        return hippo;
    }

    public static void setHippodrome(Hippodrome h) {
        Data.hippo = h;
    }
}
