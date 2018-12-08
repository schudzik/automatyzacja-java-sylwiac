public class Pies {

    public double wiek;
    public int waga;
    public String rasa;
    boolean czyRanny;
    boolean czyDuzy;

    public Pies() {
    }

    public Pies(int waga, String rasa) {
        this.rasa = rasa;
        wiek = 0;
        this.waga = waga;
    }

    public void rosnie(double lata) {
        System.out.println("rosne");

        wiek=wiek+lata;


        czyDuzy = true;
    }

    public void walcz() {
        System.out.println("walcze jak oszalały");

        czyRanny = true;
    }

    public int mnozy(int x, int y) {
        return x * y;
    }


}
