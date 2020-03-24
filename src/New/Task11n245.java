
package New;
/*Дан массив. Переписать его элементы в другой массив такого же размера
следующим образом: сначала должны идти все отрицательные элементы,
а затем все остальные. Использовать только один проход по исходному
массиву.*/
import java.util.*;
public class Task11n245 {
    public static void main(String[] args) {
        int a[] = {1,-24, 6, 2, -7, 6, 9, -6, 4, 2};
        int i;
        int j;
        int t;


//Сортируем массив
        Arrays.sort(a);
//Выводим отсортированный массив на консоль.
        for( i = 0; i <  a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        /*for (i = 1; i < a.length; i++)
            for (j = a.length - 1; j >= i; j--) {
                if (a[j - 1] > a[j]) {
                    t = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = t;
                }
            }*/
        /*
        System.out.println("Отсотированный массив ");
        for (q = 0; q < a.length; q++){
            System.out.print(" " + a[q]);}*/
        System.out.println();
            System.out.println(" Массив Б: " );

        int q;
        int b [] = new int [a.length];
      System.arraycopy(a, 0, b, 0, a.length);
        for (q = 0; q < b.length; q++){
            System.out.print(" " + b[q]);

        }



}}
