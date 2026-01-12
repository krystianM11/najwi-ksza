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


/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();

        System.out.print("Podaj trzecią liczbę: ");
        int c = scanner.nextInt();

        if (a <= b && a <= c) {
            System.out.println("Najmniejsza liczba to: " + a);
        }
        else if (b <= a && b <= c) {
            System.out.println("Najmniejsza liczba to: " + b);
        }
        else {
            System.out.println("Najmniejsza liczba to: " + c);
        }

        scanner.close();
    }
}






import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();

        System.out.print("Podaj trzecią liczbę: ");
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("Wszystkie liczby są równe");
        }
        else {
            System.out.println("Liczby nie są równe");
        }

        scanner.close();
    }
}







import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();

        System.out.print("Podaj trzecią liczbę: ");
        int c = scanner.nextInt();

        if (a < b && b < c) {
            System.out.println("Liczby są rosnące");
        }
        else if (a > b && b > c) {
            System.out.println("Liczby są malejące");
        }
        else {
            System.out.println("Liczby nie są ani rosnące, ani malejące");
        }

        scanner.close();
    }
}


*/

