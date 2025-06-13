import java.io.*;

public class ResourceLeakExample {
    public static void main(String[] args) {
        var logger = java.util.logging.Logger.getLogger("ResourceLeakExample");

        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                logger.info(line);
            }

        } catch (IOException e) {
            logger.warning(java.util.Arrays.toString(e.getStackTrace()));
        }
    }
}
