public class Task10n43 {
    static int count (int n){
        if (n < 0)
            return 1;
        else
            return count(n/10)+1;
    }
        static int rec (int n){
                if (n == 0)
            return 0;
            return n % 10 + rec(n / 10);
    }

       public static void main(String[] args) {
        System.out.println(rec(15) + count(15));
    }
}
