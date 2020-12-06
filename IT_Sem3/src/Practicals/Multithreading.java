package Practicals;

public class Multithreading extends Thread {

    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        Multithreading t1 = new Multithreading();
        Multithreading t2 = new Multithreading();

        t1.start();
        t2.start();
    }
}
