package chapter5;

public interface Herbivore {
    int amount = 10;

    public static void eatGrass() {
    }

    public int chew();
}

interface Canfly{
    void fly();
}

interface HasWings{
    public abstract Object getWindSpan();
}

abstract class Falcon implements Canfly, HasWings{

}


