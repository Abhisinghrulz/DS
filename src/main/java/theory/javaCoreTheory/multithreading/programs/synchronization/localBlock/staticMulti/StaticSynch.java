package theory.javaCoreTheory.multithreading.programs.synchronization.localBlock.staticMulti;

public class StaticSynch {
    public static void main1(String[] args) {
        Hello h1 = new Hello();
        Hello h2 = new Hello();

        MyThread myThread1 = new MyThread(h1);
        MyThread myThread2 = new MyThread(h2);
        myThread1.start();
        myThread2.start();

        /**
         * Thread-0 SHOW : 0
         * Thread-0 SHOW : 1
         * Thread-0 SHOW : 2
         * Thread-0 SHOW : 3
         * Thread-0 SHOW : 4
         * Thread-1 SHOW : 0
         * Thread-1 SHOW : 1
         * Thread-1 SHOW : 2
         * Thread-1 SHOW : 3
         * Thread-1 SHOW : 4
         */
    }

    public static void main(String[] args) {
        Hello h1 = new Hello();

        MyThread myThread1 = new MyThread(h1);
        MyThread myThread2 = new MyThread(h1);
        myThread1.start();
        myThread2.start();

        /**
         * Thread-0 SHOW : 0
         * Thread-0 SHOW : 1
         * Thread-0 SHOW : 2
         * Thread-0 SHOW : 3
         * Thread-0 SHOW : 4
         * Thread-1 SHOW : 0
         * Thread-1 SHOW : 1
         * Thread-1 SHOW : 2
         * Thread-1 SHOW : 3
         * Thread-1 SHOW : 4
         */
    }
}
