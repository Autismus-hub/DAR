package tp3.ex1;

public class Main {



    public static void main(String[] args) {

        THread1 t1 = new THread1();
        THread2 t2 = new THread2();
        Thread tt = new Thread(t2);
        t1.start();
        tt.start();
        try {
            t1.join();
            tt.join();
        } catch (InterruptedException e) {
        }
        System.out.println("it s over !!");


    }
}
