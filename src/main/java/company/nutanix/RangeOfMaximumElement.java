package company.nutanix;

/**
 * [1,5,4,3,6]
 * 1 [1, 1]   ->
 * 5 [1, 4]   -> 1 5 4 3
 * 4 [3, 4]   -> 4 3
 * 3 [4, 4]   -> 3
 * 6 [1, 5]   -> 1 5 4 3 6
 *
 */
public class RangeOfMaximumElement {

    public static void main(String[] args) {
        int [] arr = {1,5,4,3,6};
        RangeOfMaximumElement rangeOfMaximumElement = new RangeOfMaximumElement();
        rangeOfMaximumElement.printPattern(arr);
    }

    private void printPattern(int[] arr) {
        for(int i =0; i< arr.length; i++)
        {
            int min = 1, max =1; int maxCounter = Integer.MIN_VALUE;int finalMin = 0; int finalMax = 0;
            for(int j=0; j<arr.length; j++)
            {
                if(arr[i]>=arr[j])
                {
                    max = j+1;
                }
                else{
                    if((max-min)>maxCounter)
                    {
                        maxCounter = max-min;
                        finalMin = min;
                        finalMax = max;
                    }
                    min = j;
                }
            }
            System.out.println(""+arr[i] + " : "+ "[" +finalMin + "," + finalMax +"]" );
        }
    }

}
