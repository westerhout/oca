package chapter6;

public class DevideZero {

    private int a = 0;
    private int b = 0;

    public int devide(int a, int b){
        try {
            return a / b;
        }catch (ArithmeticException e){
            System.out.print("-1");
            return -1;
        }catch (RuntimeException e){
            System.out.println("0");
            return 0;
        }finally {
            System.out.print("done");
        }
    }

    public static void main(String[] args){
        new DevideZero().devide(0,0);
    }
}
