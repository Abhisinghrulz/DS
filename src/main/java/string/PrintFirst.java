package string;

/**
 * Print first character of every word
 */
public class PrintFirst {
    public static void main(String[] args) {
        String s = "My name is abhi";
        String [] strArr = s.split(" ");
        for(String a : strArr)
        {
            System.out.println(a.charAt(0));
        }
    }
}
