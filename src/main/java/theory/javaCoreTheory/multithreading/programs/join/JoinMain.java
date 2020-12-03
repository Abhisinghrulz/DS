package theory.javaCoreTheory.multithreading.programs.join;

/**
 * Thread class provides the join() method which allows one thread to wait until another thread
 * completes its execution. If t is a Thread object whose thread is currently executing, then t.
 * join() will make sure that t is terminated before the next instruction is executed by the program.
 */
public class JoinMain {
    public static void main1(String[] args) throws InterruptedException {
        Greetings g = new Greetings();
        g.start();

        System.out.println("Greetings from java learning center");
        /**
         * Greetings from java learning center
         * 10
         * 9
         * 8
         * 7
         * 6
         * 5
         * 4
         * 3
         * 2
         * 1
         */
    }

    public static void main(String[] args) throws InterruptedException {
        Greetings g = new Greetings();
        g.start();
        g.join();

        System.out.println("Greetings from java learning center");
        /**
         * 10
         * 9
         * 8
         * 7
         * 6
         * 5
         * 4
         * 3
         * 2
         * 1
         * Greetings from java learning center
         */
    }
}
