package New;


/*Удалить из массива все повторяющиеся элементы, оставив их первые вхо-ждения,
т. е. в массиве должны остаться только различные элементы.
 под удалением элемента массива следует понимать:
 исключение этого элемента из массива путем смещения всех следующих за ним элементов влево на 1 позицию;
 присваивание последнему элементу массива значения 0.
 */
public class Task11n158 {


    public static void main(String[] args) {
        int a[] = {1, 1, 2, 24, 7, 6, 6, 4, 2};
        int i;
        int j;


 int lengtharray = a.length-1;

        for (i = 0; i < a.length-1; i++)
            for (j = i+1; j < a.length-1; j++){
                if (a[i] == a[j]) {
                    for (int k = j; k < a.length-1; k++){
                        a[k] = a[k+1];
                        a[lengtharray ]=0;
                                   }
                       }
            }
        int q;
        System.out.println("Отстированный массив ");
        for (q = 0; q < a.length; q++){
            System.out.print(" " + a[q]);}


        /*
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



