package New;

public class Task12n23 {
    public static void main(String[] args) {
        int i;
        int j;

        int n = 7;
        int array[][] = new int[n][n];
        if (n % 2 != 0) {
            System.out.println("Третий массив ");
            for (i = 0; i < array.length / 2 + 1; i++) {
                for (j = i; j < array.length - i; j++) {
                    array[i][j] = 1;
                    array[array.length - i - 1][j] = 1;
                }
            }
            for (int[] row : array) {
                for (int value : row) {
                    System.out.print(" " + value + " ");
                }
                System.out.println();
            }

            System.out.println("Первый массив ");
            for (i = 0; i < array.length; i++) {
                for (j = 0; j < array.length; j++) {
                    if ((i + j) % (array.length - 1) == 0)
                        array[i][j] = 1;
                    else if (i == j)
                        array[i][j] = 1;
                    else
                        array[i][j] = 0;

                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("Второй массив ");
          for (i=0; i < array.length; i++){
            for (j=0; j < array.length; j++){
                if ((i+j)%(array.length-1) == 0 )
                    array [i][j] = 1;
                else if ( i==j )
                    array [i][j] = 1;
                else if ( j == (array.length-1)/2 || i == (array.length-1)/2 )
                    array [i][j] = 1;
                else
                    array [i] [j] =0;


                System.out.print(array [i] [j] + "\t");
            }
            System.out.println();
        }
        }
        else
            System.out.println("Введите не четное число");
    }
}


