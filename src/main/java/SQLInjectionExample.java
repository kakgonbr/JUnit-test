import java.util.logging.Level;

public class SQLInjectionExample {
    public static void main(String[] args) {
        var logger = java.util.logging.Logger.getLogger("ResourceLeakExample");
        String userInput = "' OR '1'='1";

        if (!java.util.regex.Pattern.matches("[\\w-]+", userInput))
        {
            return;
        }

        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
        logger.log(Level.INFO, "Executing query: {0}", query);
    }
}
