public class App {
    public static void main(String[] args) throws Exception {

        String nimi1 = "maija";
        String nimi2 = "ma";
        String nimi3 = "maija";

        if (nimi1 == nimi2) {
            System.out.println("Nimi1 ja nimi2 ovat samat.");
        }

        if (nimi1 != nimi2) {
            System.out.println("Nimi1 ja nimi2 ovat eri nimet.");
        }

        if (nimi1 == nimi2) {
            System.out.println("Nimi1 ja nimi2 ovat samat.");
        } else if (nimi1 == nimi3) {
            System.out.println("Nimi1 ja nimi3 ovat samat.");
        }

    }

}   
