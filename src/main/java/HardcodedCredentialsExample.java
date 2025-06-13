public class HardcodedCredentialsExample {
    public static void main(String[] args) {
        var logger = java.util.logging.Logger.getLogger("HardcodedCredentialsExample");

        String username = System.getenv("username");
        String password = System.getenv("password"); // hardcoded password
        if(authenticate(username, password)) {
            logger.info("Access granted");
        } else {
            logger.warning("Access denied");
        }
    }

    private static boolean authenticate(String user, String pass) {
        // Dummy authentication logic
        return user.equals("admin") && pass.equals("123456");
    }
}
