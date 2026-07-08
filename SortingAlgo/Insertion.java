package SortingAlgo;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int arr[] = { 4,-5,-1,2,3 };
        answer(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void answer(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {

            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr,j-1,j);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr,int max,int min){
        int temp = arr[max];
        arr[max] = arr[min];
        arr[min] = temp;
    }
    // static void swap(int arr[], int maxEl, int lastEl) {
    //     int temp = arr[lastEl];
    //     arr[lastEl] = arr[maxEl];
    //     arr[maxEl] = temp;

    // }

}
