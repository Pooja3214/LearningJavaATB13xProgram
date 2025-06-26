package Task_25June;

public class Array_seconlargestNum {

    public static int second_largest(int[] arr) {
        int n = arr.length;
        int largest_num = -1;
        int second_largestnum = -1;

        for (int i = 0; i < n; i++) {
            if(arr[i]>largest_num) {
                largest_num = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > second_largestnum && arr[i] != largest_num) {
                second_largestnum = arr[i];
            }
        }
        return second_largestnum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 56, 23, 6,49};
        System.out.println("Second largest number in array: " + second_largest(arr));
    }
}
