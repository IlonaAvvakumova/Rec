package New;

public class Task12n23 {
    public static void main(String[] args) {
        int i;
        int j;
        int n;

int array [] [] = new int[7][7];
//for (i = 0; i < 7; i++){
  //  for ( j =0; j < 7; j++){
        for (i=0; i < array.length; i++){
            for (j=0; j < array.length; j++){
                if ((i+j)%6 == 0 )
                    array [i][j] = 1;
                 else if ( i==j )
                    array [i][j] = 1;
                else
                array [i] [j] =0;

      //  array [i] [j] = (i) + (j);
        System.out.print(array [i] [j] + "\t");
    }
    System.out.println();
}


    }
}
