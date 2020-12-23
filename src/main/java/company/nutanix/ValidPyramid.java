package company.nutanix;

/**
 * 4 9 16 25
 * 2^2 3^2 4^2 5^2
 *
 *
 */
public class ValidPyramid {
    public static void main(String[] args) {
        ValidPyramid validPyramid = new ValidPyramid();
        System.out.println(validPyramid.isValidPyramid(4));
        System.out.println(validPyramid.isValidPyramid(9));
        System.out.println(validPyramid.isValidPyramid(6));

    }

    public boolean isValidPyramid(int n){
        return (int)Math.sqrt(n) * (int)Math.sqrt(n) == n;
    }
}
