package theory.javaCoreTheory.multithreading.programs.synchronization.localBlock.staticMulti;

public class MyThread extends Thread {
    Hello h = null;

    MyThread(Hello h) {
        this.h = h;
    }

    public void run() {
        h.show();
    }
}
