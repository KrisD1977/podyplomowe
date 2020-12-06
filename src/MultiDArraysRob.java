public class MultiDArraysRob {

    public static void main(String[] args) {



    int [] [] multiDA= {{1,3}, {7,9,3}, {5,6}, {9,4,6,3}};
    int [] arr = {1,2,3,4};

       for (int i = 0; i < multiDA.length; i++) {
           for (int j = 0; j < (multiDA[i].length); j++) {
               System.out.print(multiDA[i][j] + " ");
           }
           System.out.println(" ");
       }

      /*  for (int x : arr) {
            System.out.print( arr [x-1]+ " ");*/

        }
        /*for (int i : multiDA ) {
            for ( int j: multiDA );

            System.out.println( multiDA [i] [j]);
        }*/


    }







