public class Task10n52 {
    public static int rec(int num) {

       // return num<10 ?num:Integer.parseInt(String.valueOf(num%10)+rec(num/10));
        if (num<10)
            return num;
        System.out.print(num%10);
        return rec (num/10);

    }

    public static void main(String[] args) {


        System.out.println( rec(152));
    }
}