import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Wczytanie trzech liczb
        System.out.print("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();

        System.out.print("Podaj trzecią liczbę: ");
        int c = scanner.nextInt();

        // Sprawdzenie, która liczba jest największa
        if (a >= b && a >= c) {
            System.out.println("Największa liczba to: " + a);
        }
        else if (b >= a && b >= c) {
            System.out.println("Największa liczba to: " + b);
        }
        else {
            System.out.println("Największa liczba to: " + c);
        }

        scanner.close();
    }
}
