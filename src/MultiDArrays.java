public class MultiDArrays {

    public static void main(String[] args) {

        int [] [] multiDimArr = {{1,2},{5,6,7}};

        for (int i = 0; i < multiDimArr.length; i++) {

            for (int j = 0; j < multiDimArr[i].length; j++) {

                System.out.print(multiDimArr [i] [j]);
                System.out.print(" ");

            }
            System.out.println();

        }











/*

        int [] arr = {1,2,3,4,5,6,7,8};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" +i+ "]=" +arr[i]);

        }

        for (int i : arr ) {
            System.out.println(i);

        }
*/

    }
}
