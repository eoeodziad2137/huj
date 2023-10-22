import java.util.*;

public class Kalkulator {
    public static void main(String[] args) {

        double a, b, c;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe: ");
        a = keyboard.nextInt();

        System.out.println("Podaj druga liczbe: ");
        b = keyboard.nextInt();

        System.out.println("Wybierz opcje: ");
        System.out.println("1.Dodawanie ");
        System.out.println("2.Odejmowanie ");
        System.out.println("3.Mnozenie ");
        System.out.println("4.Dzielenie ");

        c = keyboard.nextInt();

        double wynik = 0;

        switch (c) {
            case '1':
                wynik = a + b;
                System.out.println("Wynik " + wynik);
                break;
            case '2':
                wynik = a - b;
                System.out.println("Wynik " + wynik);
                break;
            case '3':
                wynik = a * b;
                System.out.println("Wynik " + wynik);
                break;
            case '4':
                wynik = a / b;
                System.out.println("Wynik " + wynik);
                break;

        }

    }
}