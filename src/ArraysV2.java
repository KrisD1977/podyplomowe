import java.awt.*;

public class ArraysV2 {

    public static void main(String[] args) {

        String[] request = new String[100];
        Point[] points = new Point[100];
        int[] temps = new int[100];
        Integer[] series = new Integer[100];

        request [1] = "baba";
        points [ 2 ] =  new Point (3,2);
        temps [3] = 77;
        series [4] = 23;

        for (int i = 0; i < 10; i++) {

            System.out.print(request [i]);
            System.out.print(points [i]);
            System.out.print(temps [i]);
            System.out.print(series [i]);
            System.out.println(" ");

        }


    }
}
