package lab;

public class LAB3 {

    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
            System.out.println("2");
            System.out.println("3");
        } catch (ArithmeticException ex1) {
        } finally {
            System.out.println("4");
        }
        System.out.println("5");
    }
}
