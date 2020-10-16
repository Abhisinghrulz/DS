package string;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Get frequency of every word in string
 */
public class GetFrequency {
    public static void main(String[] args) {
        String s = "Best items in category are samsung lenovo samsung items are cool lenovo items are cool";

        Map<String, Integer> mp = new LinkedHashMap<>();

        for(String str : s.split(" "))
        {
            if(mp.containsKey(str))
            {
                mp.put(str, mp.get(str)+1);
            }
            else {
                mp.put(str, 1);
            }
        }

        System.out.println(mp);

    }
}
