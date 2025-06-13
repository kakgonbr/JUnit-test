public class OvercatchingExceptionExample {
    public static void main(String[] args) {
        var logger = java.util.logging.Logger.getLogger("OvercatchingExceptionExample");
        try {
            int[] arr = new int[5];
            logger.info(Integer.toString(arr[10]));
        } catch (IndexOutOfBoundsException e) {
            logger.warning("Runtime error");
        }
    }
}
