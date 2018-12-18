package chapter1;
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
    }
}