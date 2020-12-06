import java.awt.*;

public class   ArraysRob {

    public static void main(String[] args) {

        Point [] markup = {new Point (1,1), new Point(2,3), new Point(3,0)};
        Point p = new Point(3,3);
        markup [2] = p;
        markup [1] = markup [2];
        p.x = 99;

        for (int i = 0; i < markup.length; i++) {

                System.out.println(markup [i] + " ");

    }
        p.y = 99;
        System.out.println(markup[2]);
    }
}
