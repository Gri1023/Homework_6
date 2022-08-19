public class Main {
    public static void main(String[] args) {
        int w = 1;
        int p;
        if (w<=2) {
            p = 3;
            System.out.println("When the weight is " + w + " the price is " + p);
        }
        else if (w<2 && w<=5) {
            p = 3 + 2 * w;
            System.out.println("When the weight is " + w + " the price is " + p);
        }
        else {
            p = 3 + 2 * 5 + 3 * w;
            System.out.println("When the weight is " + w + " the price is " + p);
        }
    }
}