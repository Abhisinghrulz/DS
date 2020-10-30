package misc.moveZeroes;

public class MoveZeroesToLeft {
    public static void main(String[] args) {
        int [] arr = {0, 1, 2, 4, 5, 0, 1, 1, 0, 0, 9, 0};

        int temp;

        int counter = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]==0)
            {
                temp = arr[i];
                arr[i] = arr[counter];
                arr[counter] = temp;
                counter++;
            }
        }

        for(int e : arr)
        {
            System.out.print(e+ " ");
        }
    }
}
