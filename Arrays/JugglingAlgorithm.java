package Array;

import java.util.Arrays;

/**
 * Juggling Algorithm to implement array rotation in linear time
 *
 * Created by sam on 21/3/19.
 */
public class JugglingAlgorithm {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int rotation = 3;
        rotateArray(arr, rotation);
    }

    private static void rotateArray(int[] arr, int rotation) {
        int gcd = gcd(arr.length, rotation);
        for (int i = 0; i < gcd; i++) {
            int j, k, temp;
            temp = arr[i];
            j = i;
            while (true) {
                k = j + 3;
                if (k < arr.length) {
                    arr[j] = arr[k];
                    j = k;
                } else {
                    arr[j] = temp;
                    break;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    private static int gcd(int n1, int n2)
    {
        if (n2 != 0)
            return gcd(n2, n1 % n2);
        else
            return n1;
    }

}
