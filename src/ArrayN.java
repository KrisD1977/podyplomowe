import java.util.Scanner;

public class ArrayN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int n = scanner.nextInt();

        int[] array = new int[n];


        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = array[array.length - 1] - i;
        }

        System.out.println(" ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }
}
