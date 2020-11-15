import java.util.Scanner;

public class HelloMan {

    public static void main(String[] args) {


        System.out.print("Jak masz na imię?");

        Scanner scanner = new Scanner(System.in);

        String n = scanner.next();


        System.out.print("Cześć, " + n + "!");
        System.out.println("Miłego dnia!");
    }
}