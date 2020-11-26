package theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti;

public class Hello {
    synchronized void show(){
        Thread th = Thread.currentThread();
        for(int i=0; i<5; i++)
        {
            System.out.println(th.getName() + " SHOW : "+ i+ "\t"+ this);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
