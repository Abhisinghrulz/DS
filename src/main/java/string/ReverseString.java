package string;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Abhi";
        String d = new StringBuilder(s).reverse().toString();
        System.out.println(d);
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverseString(s));
    }

    public String reverseString(String s){
        String d = "";
        for(int i = s.length()-1; i>=0; i--)
        {
            d = d + s.charAt(i);
        }
        return d;
    }
}
