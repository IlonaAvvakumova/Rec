package New;
import java.util.*;

/*Удалить из массива все повторяющиеся элементы, оставив их первые вхо-ждения,
т. е. в массиве должны остаться только различные элементы.
В задачах 11.149—11.158 под удалением элемента массива следует понимать:
 исключение этого элемента из массива путем смещения всех следующих за ним элементов влево на 1 позицию;
 присваивание последнему элементу массива значения 0.
 */
public class Task11n158 {


    public static void main(String[] args) {
        Integer a[] = {1,24, 6, 2, 24, 7, 6, 9, 6, 4, 2};
        int i;
        int j;
        int t;
        for (i = 1; i < a.length; i++)
            for (j = a.length - 1; j >= i; j--) {
                if (a[j - 1] > a[j]) {
                    t = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = t;
                }
            }
        int q;
        System.out.println("Отстированный массив ");
        for (q = 0; q < a.length; q++){
            System.out.print(" " + a[q]);

         }








        // массив отсортирован пузырьковой сортировкой
        System.out.println();
        int b[] = new int[a.length];
        System.out.print("Массив без повторений: "+ a[0] + "");
        for (int k = 0; k <b.length-1; k++) {
            int f =k +1;

                if (a[k] != a[f]) {

                     System.out.print(" "+a[f]);}
            }
       /* System.out.println();
        System.out.println("Массив а:");

            for (q = 0; q < b.length; q++){
                System.out.print(" " + b[q]);
            }*/


        }




    }


