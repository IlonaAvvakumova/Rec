public class Task10n50 {
    public static int rec (int n, int m){

        if (n==0)
            return m+1;
       else if (n!=0 && m==0)
            return rec(n-1,1);
       else
            return  rec(n-1, rec(n,m-1));

    }

    public static void main(String[] args) {
        System.out.println(rec(3,1));
    }
}
