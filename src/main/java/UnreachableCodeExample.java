public class UnreachableCodeExample {
    public static int getNumber() {
        return 42;
//        System.out.println("This will never execute");
    }

    public static void main(String[] args) {
        var logger = java.util.logging.Logger.getLogger("UnreachableCodeExample");
        logger.info(Integer.toString(getNumber()));
    }
}
