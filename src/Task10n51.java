public class Task10n51 {
    public static int rec(int n){
                if (n>0)
                    return n;
                return rec(n-1);

    }
    public static int rec2(int n){
        if (n>0)
            return rec(n-1);
        return n;
    }
    public static int rec3(int n) {
        if (n>0)
            return n;
     else   rec(n-1);
       return n;


    }

    public static void main(String[] args) {
        System.out.println(rec(5));
        System.out.println(rec2(5));
        System.out.println(rec3(5));

    }
}