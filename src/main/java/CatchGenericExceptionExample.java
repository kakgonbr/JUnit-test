public class CatchGenericExceptionExample {
    public static void main(String[] args) {
        var logger = java.util.logging.Logger.getLogger("CatchGenericExceptionExample");
        try {
            String s = null;
            String log = Integer.toString(s.length());
            logger.info(log);
        } catch (NullPointerException e) {
            logger.warning("Something went wrong");
        }
    }
}
