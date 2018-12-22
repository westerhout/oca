package chapter2;

public class Loops {

    public static void main(String[] args) {
        new Loops().eatCheese(10);
    }

    int roomInBelly = 5;

    public void eatCheese ( int bitesOfCheese){
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese + " pieces of cheese left");

        int x = 0;
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.println();
        System.out.println("x = " + x);
    }
}
