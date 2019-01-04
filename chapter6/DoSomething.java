package chapter6;

public class DoSomething {
    public void go(){
        System.out.print("A");
        try {
            stop();
        }catch (ArithmeticException e){
            System.out.print("B");
        }finally {
            System.out.print("C");
        }
        System.out.print("D");
    }

    public void stop(){
        System.out.print("E");
        int x = 6;
        x = x / 0;
        System.out.print(x);
        System.out.print("F");
    }

    public static void main(String[] args){
        new DoSomething().go();
    }
}
