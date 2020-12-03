package theory.javaCoreTheory.multithreading.programs.wait.InstanceMulti;

public class Hello {
    synchronized void show(){
        Thread th = Thread.currentThread();
        for(int i=0; i<5; i++)
        {
            System.out.println(th.getName() + " SHOW : "+ i+ "\t"+ this);
            try {
                //Thread.sleep(500);
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
