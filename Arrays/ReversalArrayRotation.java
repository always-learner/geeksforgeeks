package Array;

import java.util.Arrays;

/**
 * Created by sam on 21/3/19.
 */
public class ReversalArrayRotation {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int rotation = 3;

        //if we split array in two parts first will be [1, 2, 3] and second will be [4,5,6,7,8,9,10,11,12]
        //Reverse first part will result [3, 2, 1]
        reversArray(arr, 0, rotation - 1);
        //reverse second part
        reversArray(arr, rotation, arr.length -1);

        //Now reverse the complete array
        reversArray(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));

    }

    private static void reversArray(final int arr[], int start, int end) {
        int temp = 0;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
