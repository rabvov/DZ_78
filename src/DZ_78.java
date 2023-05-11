public class DZ_78 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        MyThred thred = new MyThred();


        thred.start();
        thread1.start();

    }
}
