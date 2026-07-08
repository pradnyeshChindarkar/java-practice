public class MinNumber {
    public static void main(String[] arg) {
        int[] arr = { 18, 112, 7, 3, 14, 28 };
        System.out.println(minVal(arr));
        System.out.println(maxVal(arr));

    }

    static int minVal(int[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < temp) {
                temp = arr[i];
            }
        }
        return temp;
    }

    static int maxVal(int[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        return temp;
    }
}
