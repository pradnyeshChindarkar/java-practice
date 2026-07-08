public class SplitArray {
    public static void main(String[] args) {

        // [7,3,2,5,6]
        int nums[] = { 7, 8, 4, 2, 3 };
        System.out.println(splitArray(nums, 2));
    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // in the end of the loop this will contain the max item from the array.
            System.out.println("start: "+start);
            end += nums[i];
            System.out.println("end: "+end);
            System.out.println();
        }

        // binary search
        while (start < end) {
            System.out.println("In while");
            // try for the middle as a potential answer.
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, then sum=num
                    sum = num;
                    pieces++;
                    // System.out.println("pieces: "+pieces);
                    // System.out.println();
                } else {
                    // System.out.println("sum:" +sum);
                    // System.out.println("num: "+num);
                    // System.out.println();
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end; // here start == end
    }
}
