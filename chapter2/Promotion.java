package chapter2;

public class Promotion {

    double x = 39.21;
//    float y = 3.4; // needs the f for float
    float y = 4.4f;
    double a = x + y;

    short p = 10;
    short q = 3;
//    short r = p * q; // promoted to int
    int r = p * q;
    short b = (short)(p * q);

    public static void main(String[] args){


        float z = 13;
        short y = 14;
        double s = 30;
        String print = args[0];
        System.out.println(print);
        System.out.println(print + z * y * s);


        int h = 6;
        boolean c = (h >= 6) || (++h <= 7);
        System.out.println(h);
    }


}
