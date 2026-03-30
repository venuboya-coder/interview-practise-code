import java.util.Arrays;

public class ArrayRearrange {
    static void main() {
        int[] arr = {-1, 20, 30, -10, 40, -6, 50};
        int[] newArr = new int[arr.length];
        System.out.println("Original array: " +Arrays.toString(arr));
        rearrange(arr, newArr);
        printArr(newArr);
    }

    private static void printArr(int[] newArr) {
        System.out.print("New Array:" + Arrays.toString(newArr));
    }

    private static void rearrange(int[] arr, int[] newArr) {
        int j = 0;
        for (int k : arr) {
            if (k < 0) {
                newArr[j] = k;
                j++;
            }
        }
        for (int k : arr) {
            if (k > 0) {
                newArr[j] = k;
                j++;
            }
        }
    }
}
