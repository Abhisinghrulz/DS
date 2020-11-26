package theory.javaCoreTheory.multithreading.programs.synchronization.localBlock.InstanceMulti;

public class InstanceSynch {
    public static void main(String[] args) {
        Hello h1 = new Hello();
        Hello h2 = new Hello();

        MyThread myThread1 = new MyThread(h1);
        MyThread myThread2 = new MyThread(h2);
        myThread1.start();
        myThread2.start();

        /**
         * Thread-1 SHOW : 0	theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti.Hello@2082e058
         * Thread-0 SHOW : 0	theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti.Hello@8dd480f
         * Thread-1 SHOW : 1	theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti.Hello@2082e058
         * Thread-0 SHOW : 1	theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti.Hello@8dd480f
         * Thread-1 SHOW : 2	theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti.Hello@2082e058
         * Thread-0 SHOW : 2	theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti.Hello@8dd480f
         * Thread-1 SHOW : 3	theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti.Hello@2082e058
         * Thread-0 SHOW : 3	theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti.Hello@8dd480f
         * Thread-1 SHOW : 4	theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti.Hello@2082e058
         * Thread-0 SHOW : 4	theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti.Hello@8dd480f
         *
         */

    }

    public static void main1(String[] args) {
        Hello h1 = new Hello();

        MyThread myThread1 = new MyThread(h1);
        MyThread myThread2 = new MyThread(h1);
        myThread1.start();
        myThread2.start();

        /**
         "C:\Program Files\Java\jdk1.8.0_221\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.2.2\lib\idea_rt.jar=55925:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.2.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_221\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\rt.jar;C:\Users\Abhis\IdeaProjects\DS\target\classes" theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti.InstanceSynch
         Thread-0 SHOW : 0	theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti.Hello@723f2556
         Thread-0 SHOW : 1	theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti.Hello@723f2556
         Thread-0 SHOW : 2	theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti.Hello@723f2556
         Thread-0 SHOW : 3	theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti.Hello@723f2556
         Thread-0 SHOW : 4	theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti.Hello@723f2556
         Thread-1 SHOW : 0	theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti.Hello@723f2556
         Thread-1 SHOW : 1	theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti.Hello@723f2556
         Thread-1 SHOW : 2	theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti.Hello@723f2556
         Thread-1 SHOW : 3	theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti.Hello@723f2556
         Thread-1 SHOW : 4	theory.javaCoreTheory.multithreading.programs.synchronization.InstanceMulti.Hello@723f2556


         */

    }
}
