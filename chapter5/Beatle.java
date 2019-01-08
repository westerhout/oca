package chapter5;

interface HasExoskeleton {
    abstract int getNumberOfSections();
}

abstract class Insect implements HasExoskeleton {
    abstract int getNumberOfLegs();
}

public class Beatle {
    int getNumberOfLegs() {
        return 6;
    }

    public static void main(String[] args) {
        new Beatle();
    }
}
