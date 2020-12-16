package theory.javaCoreTheory.basic;

public class C {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);
        System.out.println(a.getA());

        A b = new B();

        System.out.println(b.a);
        System.out.println(b.getA());
    }
}
