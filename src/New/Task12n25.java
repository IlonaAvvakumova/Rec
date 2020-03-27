package New;

public class Task12n25 {
    public static void main(String[] args) {
        int i;
        int j;
        int n = 10;
        int m = 12;
        int array[][] = new int[m][n];
        int k = 1;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                array[i][j] = k++;

                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
