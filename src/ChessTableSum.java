import java.util.Locale;

public class ChessTableSum {

    public static void main(String[] args) {

        long [] chessTable = new long [64];

        for (int i = 1; i < chessTable.length; i++) {
            chessTable [i] = (long)Math.pow(2, i);
        }
        long suma= 0L;

        for (int i = 0; i < (chessTable.length-1); i++) {
            suma = suma + chessTable[i];
        }

        System.out.printf("%,d %n",suma);

        System.out.println(" ");

        System.out.printf( "%,d %n", chessTable [63]);

        Long c = suma + chessTable[63];

       /* int[][] chessTable = new int[8][8];

        for (int i = 1; i < chessTable.length; i++) {
            for (int j = 0; j < chessTable[i].length; j++) {
                chessTable[i][j] = i + j;

            }
        }
        System.out.println(chessTable[7][7]);
*/
    }
}
