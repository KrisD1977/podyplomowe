import java.awt.*;

public class Arrays {

    public static void main(String[] args) {

    /*    String [] requests;
        Point [] points;

        int [] temps = new int[100];
       //temps [99];

        Integer [] series = new Integer[3];
        series [0] = new Integer(4);
        series [1] = 2;
        series [2] = 7;


        System.out.println(series[0]);
        System.out.println(series[1]);
        System.out.println(series[2]);
        System.out.println(series[3]);


        Integer [] series2 = {4,7,2};*/


        Point[] markup = {new Point(1, 1), new Point(2, 3), new Point(3, 0)};
        Point p = new Point(3, 3);

        markup[2] = p;
        markup[1] = markup[2];

        markup[1].x = 20;
        p.y = 999;

        System.out.println(markup[0]);
        System.out.println(markup[1]);
        System.out.println(markup[2]);

    }
}
