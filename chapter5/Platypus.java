package chapter5;

class Mammal {
    public Mammal(int age) {
        System.out.print("Mammal");
        System.out.print(age);
    }

    public Mammal() {
        this(5);
    }
}


public class Platypus extends Mammal {
    public Platypus() {
        super(7);
        System.out.print("Platypus");
    }

    public static void main(String[] args) {
        new Mammal();
    }
}




