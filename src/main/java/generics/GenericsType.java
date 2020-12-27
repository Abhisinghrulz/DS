package generics;

public class GenericsType<T> {

    private T t;

    public T get(){
        return this.t;
    }

    public void set(T t1){
        this.t=t1;
    }

    public static void main(String args[]){
        GenericsType<String> type = new GenericsType<>();
        type.set("Pankaj"); //valid
        System.out.println(type.get());

        GenericsType<Integer> type1 = new GenericsType<>();
        type1.set(1); //valid
        System.out.println(type1.get());

        GenericsType type2 = new GenericsType(); //raw type
        type2.set("Pankaj"); //valid
        type2.set(10); //valid and autoboxing support
    }
}