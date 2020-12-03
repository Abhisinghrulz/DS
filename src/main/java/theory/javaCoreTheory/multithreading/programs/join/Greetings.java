package theory.javaCoreTheory.multithreading.programs.join;

public class Greetings extends Thread{
    public void run() {
        for (int i = 10; i >= 1; i--) {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
