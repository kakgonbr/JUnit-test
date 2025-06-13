public class NullPointerExample {
    public static void main(String[] args) {
        var logger = java.util.logging.Logger.getLogger("NullPointerExample");
        String text = null;

        if (text == null) {
            logger.warning("text is null");
        } else if (text.isEmpty()) {
            logger.info("Text is empty");
        } else {
            logger.info("Text is not empty");
        }
    }
}
