package SortingAlgo;

import java.util.ArrayList;
import java.util.List;

public class AllMissingNum {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }

    static List<Integer> findDisappearedNumbers(int nums[]) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }else{
                i++;
            }
        }
        return getMissingNum(nums);
    }

    static void swap(int arr[], int idx, int elem) {
        int temp = arr[idx];
        arr[idx] = arr[elem];
        arr[elem] = temp;
    }

    static List<Integer> getMissingNum(int[] arr) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i+1) {
                ans.add(i+1);
            }
        }
        return ans;
    }
}
