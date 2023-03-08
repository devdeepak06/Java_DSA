package Recursion;

public class QuickSort1 {
    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[si];
        int smallCount = 0;
        for (int i = si + 1; i <= ei; i++) {
            if (arr[i] < pivot) {
                smallCount++;
            }
        }
        int temp = arr[si + smallCount];
        arr[si + smallCount] = pivot;
        arr[si] = temp;
        int i = si;
        int j = ei;
        while (i < j) {
            if (arr[i] < pivot) {
                i++;
            } else if (arr[j] >= pivot) {
                j--;
            } else {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return si + smallCount;
    }
    public static void quickSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivotIndex = partition(arr, si, ei);
        quickSort(arr, si, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, ei);
    }
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
