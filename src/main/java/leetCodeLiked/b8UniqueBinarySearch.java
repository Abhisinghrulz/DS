package leetCodeLiked;

/**
 * 1 2 3 4
 *
 * Total Comb = c0c3 + c1c2 + c2c1 + c3c0
 *
 */
public class b8UniqueBinarySearch {
    public int numTrees(int n) {
        return catalanNumber(n);
    }

    int catalanNumber(int n){
        int [] catalan = new int[n+1];
        catalan[0] = 1;
        catalan[1] = 1;

        for(int i =2; i<=n; i++)
        {
            catalan[i] = 0;
            for(int j = 0;j<i; j++)
            {
                catalan[i]+= catalan[j] * catalan[i-j-1];
            }
        }
        return catalan[n];
    }
}
