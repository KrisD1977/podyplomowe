import java.util.Scanner;

public class ArrayNRob {

    int n;
    int[] array = {};


    void fillArray() {
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
    }

    void showArray() {
        System.out.print("tablica:           ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    void fillRevArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[array.length - 1] - i;
        }
    }

    void showRevArray() {
        System.out.print("\nodwrócona tablica: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int l = scanner.nextInt();

        ArrayNRob k = new ArrayNRob();
        System.out.println();

        k.n = l;
        k.array = new int[k.n];

        k.fillArray();
        k.showArray();
        k.fillRevArray();
        k.showRevArray();

    }


}
