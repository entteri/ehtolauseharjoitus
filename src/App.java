public class App {
    public static void main(String[] args) throws Exception {
        int luku1 = 15;
        int luku2 = 15;
        int luku3 = 15;

        if (luku1 == luku2 || luku2 == luku3) {
            System.out.println("Luku1 on yhtä suuri kuin Luku2 TAI Luku2 on yhtä suuri kuin Luku3");
        } else if (luku1 > luku2 && luku1 == luku3) {
            System.out.println("Luku1 on suurempi kuin Luku2 JA luku1 on yhtä suuri kuin Luku3");
        } else if (luku1 == luku2 && luku1 == luku3) {
            System.out.println("Luvut ovat yhtä suuria");
        } else {
            if (luku1 > luku2) {
                System.out.println("Luku1 on suurempi kuin luku2");
            } else {
                if (luku2 > luku3 ) {
                    System.out.println("Luku2 on suurempi kuin luku3");
                } else {
                    ;
                }
            }
        }
        if (luku1 == luku2) {
            System.out.println("Luku1 ja luku2 ovat yhtä suuria");
        } else if (luku2 == luku3) {
            System.out.println("Luku2 ja luku3 ovat yhtä suuria");
            ;
        }
        System.out.println("Ohjelma päättyi.");
    }
}
