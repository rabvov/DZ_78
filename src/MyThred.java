public class MyThred extends Thread{
    private int i=0;
public void run(){
    for (int j = 0; j <10 ; j++) {
        i++;
    }
    System.out.println(i);
}
}
