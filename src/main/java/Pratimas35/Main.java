package Pratimas35;

public class Main {
    public static void main(String[] args) {
        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();

    }
}
