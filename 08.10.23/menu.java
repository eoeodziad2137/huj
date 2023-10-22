import java.util.*;

public class kalk {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("JERUSALEM KEBAB ");
        System.out.println("1. Kebab w bułce ");
        System.out.println("2. Kebab Rollo");
        System.out.println("3. Kebab Box ");
        System.out.println("4. Falafel (gówno) ");
        System.out.println("5. Baclava");

        System.out.println("Wybierz pozycje w menu: ");
        char operator = keyboard.next().charAt(0);

        double wynik;

        switch (operator) {
            case '1':
                System.out.println("20zł; Buła mięcho, surówki, sosiwo");
                break;
            case '2':
                System.out.println("20zł; rollo, mięcho, surówki, sosiwo");

                break;
            case '3':
                System.out.println("20zł; kartonowe pudło, frytki, surówki, sosiwo");

                break;
            case '4':
                System.out.println("25zł; rollo albo buła, surówki, sos(najostrzejszy), kotlet z grochu");
                break;
            case '5':
                System.out.println(
                        "5zł; zawiera: orzechy, cukier i cos jeszcze niebianski smak imperium osmanskiego badz tez grecji");
                break;
            default:
                System.out.println("Nie ma takiej pozycji");
                break;

        }

    }
}