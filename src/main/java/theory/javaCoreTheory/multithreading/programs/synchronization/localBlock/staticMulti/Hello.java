package theory.javaCoreTheory.multithreading.programs.synchronization.localBlock.staticMulti;

public class Hello {
    static synchronized void show() {
        Thread th = Thread.currentThread();
        synchronized (Hello.class) {
            for (int i = 0; i < 5; i++) {
                System.out.println(th.getName() + " SHOW : " + i + "\t");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
