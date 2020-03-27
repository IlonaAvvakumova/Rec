package New;

public class Task12n24 {
    public static void main(String[] args) {
        int i;
        int j;
        int n = 6;
        int array[][] = new int[n][n];

        System.out.println("Первый массив ");
        for (i = 0; i < n; i++) {
            array[0][i] = 1;
            array[i][0] = 1;
        }

        for (int k = 1; k < n; k++) {

            for (int s = 1; s < n; s++) {
                array[k][s] = array[k - 1][s] + array[k][s - 1];
            }}
            for (int k = 0; k < n; k++) {
                for (int s = 0; s < n; s++) {
                    System.out.print(array[k][s] + "\t" );
                }
                System.out.println();
            }


            System.out.println("Второй массив ");


            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {

                    if ((j + i) < n)
                        array[i][j] = i + (j + 1);
                    else if ((j + i) >= n)
                        array[i][j] = (i + (j + 1)) - array.length;

                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }



