package New;
import java.util.*;

public class Task12n25 {
    private static int vDimension = 12;
    private static int hDimension = 10;

    public static void main(String[] args) {
        createAndPrintArrayA();
        createAndPrintArrayB();
    }

    private static void createAndPrintArrayA() {
        int[][] array = new int[vDimension][hDimension];
        int k = 1;
        for (int i = 0; i < vDimension; i++) {
            for (int j = 0; j < hDimension; j++) {
                array[i][j] = k++;
            }
        }

        print("Первый массив", array);
    }

    private static void createAndPrintArrayB() {
        int[][] array2 = new int[vDimension][hDimension];
        int k = 1;

        for (int i = 0; i < hDimension; i++) {
            for (int j = 0; j < vDimension; j++) {
                array2[j][i] = k++;
            }
        }

        print("Второй массив", array2);
    }

    public static void print(String comment, int[][] array) {
        System.out.println(comment);
        int vDim = array.length;
        int hDim = array[0].length;

        for (int i = 0; i < vDim; i++) {
            for (int j = 0; j < hDim; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
