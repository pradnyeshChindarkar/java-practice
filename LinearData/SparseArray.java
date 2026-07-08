package LinearData;

public class SparseArray {
    public static void main(String[] args) {
        int sparseMatrix[][] = {
                { 0, 0, 3, 0, 4 },
                { 0, 0, 5, 7, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 2, 6, 0, 0 }
        };
        int size = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (sparseMatrix[i][j] != 0) {
                    size++;
                }
            }
        }

        System.out.println(size);

        int newMatrix[][] = new int[3][size];

        int colk = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (sparseMatrix[i][j] != 0) {
                    newMatrix[0][colk] = i;
                    newMatrix[1][colk] = j;
                    newMatrix[2][colk] = sparseMatrix[i][j];
                    colk++;
                }
            }
        }

        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(newMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
