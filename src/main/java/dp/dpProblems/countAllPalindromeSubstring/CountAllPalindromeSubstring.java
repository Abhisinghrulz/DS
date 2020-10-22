package dp.dpProblems.countAllPalindromeSubstring;

public class CountAllPalindromeSubstring {

    int count = 0;

    private int lpSubStringTopDown(String str, int start, int end, Integer[][] arr) {
        if (start > end) {
            return 0;
        }

        if (start == end) {
            return 1;
        }

        if (arr[start][end] == null) {
            if (str.charAt(start) == str.charAt(end)) {
                int lpsRemainingString = end - start - 1;

                if (lpsRemainingString == lpSubStringTopDown(str, start + 1, end - 1, arr)) {
                    count ++;
                    arr[start][end] = 2 + lpsRemainingString;
                    return arr[start][end];
                }

            }

            arr[start][end] = Math.max(lpSubStringTopDown(str, start, end - 1, arr), lpSubStringTopDown(str, start + 1, end, arr));
        }

        return arr[start][end];
    }

    public static void main(String[] args) {
        String str = "bcacbf";
        CountAllPalindromeSubstring countAllPalindromeSubstring = new CountAllPalindromeSubstring();
        countAllPalindromeSubstring.count = str.length();
        Integer[][] arr = new Integer[str.length()][str.length()];
        countAllPalindromeSubstring.lpSubStringTopDown(str, 0, str.length() - 1, arr);
        System.out.println(countAllPalindromeSubstring.count);
    }

}

