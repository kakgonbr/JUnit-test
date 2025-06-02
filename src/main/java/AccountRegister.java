public class AccountRegister {
    boolean registerAccount(String username, String password, String email) {
        return email(email) && password(password) && username(username);
    }

    public static boolean email(String email) {
        return java.util.regex.Pattern.compile("^((?!\\.)[\\w\\-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$")
                .matcher(email).find();
    }

    public static boolean password(String password) {
        return password.trim().length() > 6;
    }

    /**
     * Username can ONLY contain a-z, A-Z, 0-9, "-" and "_"<br>
     * </br>
     * Username cannot be shorter than 5 or exceed 32 characters
     * 
     * @param username
     * @return
     */
    public static boolean username(String username) {
        return username == null ? false : java.util.regex.Pattern.compile("^[\\w_-]{5,32}$", java.util.regex.Pattern.CASE_INSENSITIVE)
                .matcher(username).find();
    }
}
