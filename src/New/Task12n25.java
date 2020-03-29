package New;
import java.util.*;

public class Task12n25 {
    private static int M = 12;
    private static int N = 10;

    public static void main(String[] args) {
        int [][] array = new int[M][N];
        int k = 1;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = k++;
            }
        }
       print("Первый массив ",array);


      int array2[][] = new int[M][M];
        k = 1;
        
        for (int i = 0; i < M; i++) {

            for (int j = 0; j < M; j++) {
                array2[i][j] = k++;
            }
        }

        for (int i = 0; i < M; i++) {

            for (int j = i+1; j < M; j++) {
                int temp = array2[i][j];
                array2[i][j] = array2[j][i];
                array2[j][i] = temp;
            }
        }
        print ("Второй массив ", array2);

    }

    public static void  print (String comment, int  array [][]) {
        System.out.println(comment);
        int m =array.length;
        int n = array[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
