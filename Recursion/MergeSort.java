package Recursion;

public class MergeSort {
    
    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] firstHalf = new int[mid];
        int[] secondHalf = new int[arr.length - mid];
        for(int i = 0; i < mid; i++){
            firstHalf[i] = arr[i];
        }
        for(int i = mid; i < arr.length; i++){
            secondHalf[i - mid] = arr[i];
        }
        firstHalf = mergeSort(firstHalf);
        secondHalf = mergeSort(secondHalf);
        int[] ans = merge(firstHalf, secondHalf);
        return ans;
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int[] ans = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                ans[k] = arr1[i];
                i++;
                k++;
            }else{
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i < arr1.length){
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length){
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 6, 8, 5, 4, 3 };
        int[] ans = mergeSort(arr);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
