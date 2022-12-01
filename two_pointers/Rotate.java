package two_pointers;

public class Rotate {

    public static int[] reverse(int arr[], int start, int end) {
        // System.out.println(end);
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;// 3, 4, 5
            end--; // 6, 5, 4
        }
        return arr;
    }

    public static int[] rotate(int arr[], int key) {
        key %= arr.length;// 2
        System.out.println("key: "+key);
        reverse(arr, 0, arr.length - 1);// {8,7,6,5,4,3,2,1}
        reverse(arr, 0, key -1);// {6,7,8,5,4,3,2,1}
        reverse(arr, key, arr.length - 1);// {6,7,8,1,2,3,4,5}
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };// {}
        int key = 3;

        int res[] = rotate(arr, key);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
