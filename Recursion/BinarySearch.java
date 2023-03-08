package Recursion;

public class BinarySearch {
    public static int binarySearch(int[] arr, int x, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = (si + ei) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] > x) {
            return binarySearch(arr, x, si, mid - 1);
        } else {
            return binarySearch(arr, x, mid + 1, ei);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int x = 5;
        int si = 0;
        int ei = arr.length - 1;
        System.out.println(binarySearch(arr, x, si, ei));
    }
}
