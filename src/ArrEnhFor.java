public class    ArrEnhFor {

    public static void main(String[] args) {

      /*  int [] arr = new int[5];
        arr [0] = 3;
        arr [1] = 5;
        arr [2] = 3;
        arr [4] = 13;
*/

       /* int [] arr = {3, 5, 3, 0, 13};*/
        Integer [] arr =  { 10,11,12,13,14};
       /* arr [0] =  10;
        arr [1] =  11;
        arr [2] =  12;
        arr [3] =  13;
        arr [4] =  14;*/

        char [] letters = {'a', 'b', 'c','d','e', 'f'};

        for (int i = 0; i < arr.length; i++) {
            letters [i] = letters [ i +1];
            System.out.printf("%3s ",  arr [i] + "" + letters [i]);

            for (int j = 0; j < arr.length; j++) {


            arr [ j ] =arr[ j ] ;
            System.out.printf("%3s ",  arr [j] + 1);
        }
            System.out.println(" ");
        }

        /*for (int x: arr) {
            System.out.printf("%3s ",  x);
            for (int y: arr) {
                System.out.printf("%3s ",  y + 1);
            }
            System.out.println(" ");
        }*/
    }
}
