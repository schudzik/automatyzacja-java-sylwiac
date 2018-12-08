public class Test {


    public static void main(String[] args) {
        Pies bary = new Pies(10, "k");
        System.out.println("pies przed walką " + bary.czyRanny);

        bary.walcz();
        System.out.println("pies po walką " + bary.czyRanny);


        System.out.println("po urodzeniu " + bary.czyDuzy);

        System.out.println(bary.wiek);

        bary.rosnie(5);
        System.out.println("pies po roku " + bary.czyDuzy);
        System.out.println(bary.wiek);
    }
}

