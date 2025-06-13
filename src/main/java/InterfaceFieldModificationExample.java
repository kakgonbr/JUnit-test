class Constants {
    public Constants() {};

    private static int maxUser = 100;

    public static int getMaxUser() {
        return maxUser;
    }

    public static void setMaxUser(int newMax) {
        maxUser = newMax;
    }
}

public class InterfaceFieldModificationExample {
    public static void main(String[] args) {
         Constants.setMaxUser(200); // Compile-time error
    }
}
