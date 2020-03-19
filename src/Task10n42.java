public class Task10n42 {
    static int rec (int a, int n){
        if (n == 0)
            return 1;
        return a * rec(a, n - 1);
    }
    public static void main(String[] args) {
        System.out.println(rec(4,2));
    }
}
