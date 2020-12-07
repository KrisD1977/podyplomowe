import java.util.Random;

public class    ChristmasTreeAscii {

    public static void main(String[] args) {
        int rows = 35;

        char[] signs = {'+', '.', '*', '~', '^', 'o'};

        char [] randomSigns = new char[rows+1];

        for (int i = 0; i < rows+1 ; i++) {
            Random los = new Random();
            int a = los.nextInt(6);
            randomSigns [i] = signs[a];

        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < (2*i +1) ; j++) {
                Random los = new Random();
                int a = los.nextInt(randomSigns.length);

                for (int k = 0; k < (40-i) && j==0; k++) {
                    System.out.print(" ");
                }
                
            System.out.print(randomSigns [a] );
            }
            System.out.println(" ");

        }


    }
}
