public class Array3D {

    public static void main(String[] args) {

       /* int [] [] [] arr3D = new int[][][];

        arr3D [0][0][0] = 1;
        arr3D [0][0][1] = 2;
        arr3D [0][0][2] = 3;
        arr3D [0][1][0] = 5;
        arr3D [1][0][0] = 1;
        arr3D [2][0][0] = 6;
        arr3D [2][1][0] = 7;

        System.out.println("arr");*/

        int[][][] arr = new int[3][3][3];

        arr [0][0][0] = 9;
        arr [0][0][1] = 9;
        arr [0][0][2] = 8;
        arr [0][1][0] = 5;
        arr [1][0][0] = 1;
        arr [2][0][0] = 6;
        arr [2][1][0] = 7;

        System.out.println();




        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    System.out.print(arr [0] [0] [k]);
                    System.out.print(" ");

                }
                System.out.println();

            }

        }


    }
}
