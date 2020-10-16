package string;

public class Aabbccdd {
    public static void main(String[] args) {
        //aabbccdd -> a2b2c2d2
        String s = "aabbccdd";
        StringBuilder sb = new StringBuilder();
        char[] letters = s.toCharArray();
        int counter = 1;
        for(int i=0; i<letters.length; i++)
        {
            if(letters.length == i+1)
            {
                sb.append(letters[i]).append(counter);
                break;
            }
            if(letters[i]==letters[i+1])
            {
                counter = counter + 1;
            }
            else
            {
                sb.append(letters[i]).append(counter);
                counter = 1;
            }
        }
        System.out.println(sb.toString());
    }
}
