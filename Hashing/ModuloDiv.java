package Hashing;

public class ModuloDiv {
    static int hash(int key, int tableSize) {
        return key % tableSize;
    }

    static int hash(int key) {

        int sum = 0;

        while (key > 0) {

            sum += key % 100;

            key /= 100;

        }

        return sum;

    }

    static int hashfold(int key) { 

        int sum = 0; 

        boolean reverse = false; 

 

        while (key > 0) { 

            int part = key % 100; 

            if (reverse) { 

                part = Integer.parseInt(new StringBuilder(String.valueOf(part)).reverse().toString()); 

            } 

            sum += part; 

            reverse = !reverse; 

            key /= 100; 

        } 

        return sum; 

    } 

    public static void main(String[] args) {
        System.out.println(hashfold(716911));
        System.out.println(33883843/100);
    }
}
