public class Task10n49 {
    public static int rec (int [] array, int i){

        if (i == array.length)
            return 0;
        int max = rec(array, i+1);
        return array[i] < array[max] ? max : i;
    }

    public static void main(String[] args) {
        System.out.println(rec(new int[]{1, 5, 9, 3, 8, 1}, 0));
    }
}
