package lab;

public class LAB7 {

    public static void main(String[] args) throws Exception {
        System.out.println("Main method call method doThis()");
        try {
            doThis();
        } catch (MyException e) {
            System.out.println("Main method receive exception " + e.getMessage());
        }
    }

    public static void doThis() throws Exception {
        System.out.println("Method doThis() call method doThat()");
        doThat();
    }

    public static void doThat() throws Exception {
        throw new Exception();
    }
}
