import java.io.*;

public class PathTraversalExample {
    public static void main(String[] args) throws IOException {
        var logger = java.util.logging.Logger.getLogger("PathTraversalExample");

        String userInput = "../secret.txt";
        File file = new File(userInput);
        if (file.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            logger.info("Reading file: " + file.getPath());
            reader.close();
        }
    }
}
