package New;
import java.util.*;

public class Task12n25 {
    public static void a (int  array [][], int n, int m) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int i;
        int j;
        int n = 10;
        int m = 12;
       int array[][] = new int[m][n];
        int k = 1;
        System.out.println("Первый массив ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                array[i][j] = k++;
            }
        }
       // a(array, n, m);

        System.out.println("Второй массив ");

      int array2[][] = new int[m][m];

         k = 1;
        for (i = 0; i < m; i++) {

            for (j = 0; j < m; j++) {
                array2[i][j] = k++;

            }
        }
        for (i = 0; i < m; i++) {

            for (j = i+1; j < m; j++) {
                int temp = array2[i][j];
                array2[i][j] = array2[j][i];
                array2[j][i] = temp;

            }

        }
        a(array2, n, m);
    }
}
