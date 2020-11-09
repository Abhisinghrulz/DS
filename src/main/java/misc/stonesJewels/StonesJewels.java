package misc.stonesJewels;

public class StonesJewels {
    public static void main(String[] args) {
        StonesJewels stonesJewels = new StonesJewels();
        int i = stonesJewels.numJewels("aA", "aAAbbbb");
        System.out.println(i);
    }
    public int numJewels(String J, String S) {
        int num_jewels = 0;

        for (int i = 0; i < S.length(); i++) {
            if (J.indexOf(S.charAt(i)) > -1) {
                num_jewels = num_jewels + 1;
            }
        }
        return num_jewels;
    }
}
