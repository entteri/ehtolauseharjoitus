public class App {
    public static void main(String[] args) throws Exception {
        int luku1 = 11;
        int luku2 = 15;

        if (luku1 == luku2) {
            System.out.println("Luku1 on yhtä suuri kuin Luku2");
        } else if (luku1 > luku2) {
            System.out.println("Luku1 on suurempi kuin Luku2");
        } else if (luku1 >= luku2) {
            System.out.println("Luku1 on suurempi tai yhtä suuri kuin Luku2");
        } else {
            System.out.println("Luku1 on pienempi kuin Luku2");
        }
    }
}
