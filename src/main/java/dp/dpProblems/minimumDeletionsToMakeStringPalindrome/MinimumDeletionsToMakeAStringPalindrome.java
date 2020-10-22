package dp.dpProblems.minimumDeletionsToMakeStringPalindrome;

public class MinimumDeletionsToMakeAStringPalindrome {

    public static void main(String[] args) {
        String str = "abefbac";

        System.out.println(minDeletionsToMakeStringPalindrome(str));
    }

    public static int minDeletionsToMakeStringPalindrome(String str) {
        if(str == null || str.length() == 0) {
            return 0;
        }
        Integer[][] arr = new Integer[str.length()][str.length()];

        return str.length() - lpsTopDown(str, 0, str.length() - 1, arr);
    }

    private static int lpsTopDown(String str, int start, int end, Integer[][] arr) {
        if (start > end) {
            return 0;
        }

        if (start == end) {
            return 1;
        }

        if (arr[start][end] == null) {
            if (str.charAt(start) == str.charAt(end)) {
                arr[start][end] = 2 + lpsTopDown(str, start + 1, end - 1, arr);
            } else {
                arr[start][end] = Math.max(lpsTopDown(str, start + 1, end, arr), lpsTopDown(str, start, end - 1, arr));
            }
        }

        return arr[start][end];
    }
}
