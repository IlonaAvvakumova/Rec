public class Task10n44 {
    static int rec ( int n){
        if (n == 0)
            return 0;
        int k = n%10 + rec(n/10);
        return k%10 + rec(k/10);
    }
    public static void main(String[] args) {
        System.out.println(rec(123));
    }
}
