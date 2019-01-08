package chapter5;

interface Noctural{
    default boolean isBlind(){
        return true;
    }
}

public class Owl implements Noctural{
//    public boolean isBlind(){
//        return false;
//    }

    public static void main(String[] args){
        Noctural noctural =  new Owl();
        System.out.println(noctural.isBlind());
    }
}
