public class Task10n47 {
    static int rec (int i){
        if (i <= 2)
            return 1;
        return rec(i - 1) + rec(i - 2);
    }
    public static void main(String[] args) {
        System.out.println(rec(7));
    }
}
