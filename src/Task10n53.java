import java.util.*;
public class Task10n53 {
    /*Написать рекурсивную процедуру для ввода с клавиатуры последовательно-
сти чисел и вывода ее на экран в обратном порядке (окончание последова-
тельности — при вводе нуля).*/
    public static void rec1(int [] array, int i) {
        if (array[i] !=0){
            rec1(array, i+1);
        System.out.println(array[i]);}



   }

   public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        //int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
      //  int array[] = new int[size]; // Создаём массив int размером в size
       int array [] = {2,3,4,5};

        rec1(array, 0);
    }
}
