public class Task10n41 {
    static int rec (int a){
        if (a == 1)
            return 1;
        return a*rec(a - 1);
    }

    public static void main(String[] args) {
        System.out.println(rec(4));
    }
}
