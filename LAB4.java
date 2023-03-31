package lab;

public class LAB4 {

    public static void main(String[] args) {
        int[] x = new int[5];
        try {
            System.out.println("1");
            System.out.println(1 / 0);
//            System.out.println(x[5]);
            System.out.println("3");
        } catch (ArithmeticException ex1) {
        } catch (IndexOutOfBoundsException ex2) {
            throw ex2;
//        } catch (IllegalArgumentException ex2) {
//            throw ex2;
        } finally {
            System.out.println("4");
        }
        System.out.println("5");
    }
}
