public class Array3DPrinter {

    public static void main(String[] args) {

        int [] [] [] arr = {{{1,2},{5}},{{1}},{{1,2,3},{1,1}}};
        for (int i = 0; i < arr.length; i++) {
           // System.out.println(arr [i] [0] [0]);

            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("arr: [" +i +"][" + j + arr [i] [j] [k] );

                }

            }

        }
    }
}
