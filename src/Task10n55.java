import java.util.*;
public class Task10n55 {
    /*Написать рекурсивную процедуру перевода натурального числа из десятич-
ной системы счисления в N-ричную. Значение N в основной программе вво-
дится с клавиатуры (2 <= N <= 16).*/
    private static char charMap[] = {'0', '1', '2', '3', '4', '5', '6',
            '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static String convertFromDecimalToBaseN(int num, int n, String result) {
        int r = num % n;
        int rest = num / n;

        if (rest > 0) {
            return convertFromDecimalToBaseN(rest, n, charMap[r] + result);
        }

        return charMap[r] + result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insert number ");
        int number = s.nextInt();
        System.out.println("Insert Base");
        int n = s.nextInt();
        System.out.println(convertFromDecimalToBaseN(number, n, ""));
    }
}
