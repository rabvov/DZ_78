public class MyRunnable implements Runnable{
    private double i = 10;
    public void run() {
        for (int j = 0; j < 5; j++) {
            i = i/2;
        }
        System.out.println(i);
    }
}
