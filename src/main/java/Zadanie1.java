import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        String wzorzec = "exit";
        String zKlawiatury = "";

        System.out.println("Witaj świecie");
        while (!(zKlawiatury.equals(wzorzec))) {

            System.out.println("Aby zamknac aplikację wpisz exit i wciśnij klawisz enter");
            Scanner odczyt = new Scanner(System.in);
            zKlawiatury = odczyt.nextLine();

        }
       System.out.println("Udało się, dziękuję");
    }

}
