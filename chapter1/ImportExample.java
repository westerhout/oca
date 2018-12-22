
import java.util.Random;
//import java.lang.System; // redundant
//import java.lang.*; // redundant
//import java.*; // wildcard only matches class names
//import java.util.Ramdom.* // cannot import methods, only classes
import java.util.*;
import java.sql.*; // does not compile, Date matches 2 classes
import java.sql.Date; // does compile, explicit import takes presedence over wildcards


public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));

        Date date;
        java.util.Date utilDate;

        int i1, i2, i3 = 0;

        String s1 = "yes", s2 = "NO";

//        String s1, int num; // Does not compile

//        double d1, double d2; // DNC

//        String s1 = "1", s2;

//        int i3; i4; // DNC
    }
}