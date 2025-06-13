import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class AccountRegisterTest {
    static AccountRegister accountRegister;

    @BeforeAll
    static void initAll() {
        accountRegister = new AccountRegister();
    }

    @AfterAll
    static void cleanupAll() {
        accountRegister = null;
    }

    @CsvFileSource(resources = "/accounts.csv", numLinesToSkip = 1)
    @ParameterizedTest(name = "({0}, {1}, {2}, {3})")
    void testAccountRegistration(String username, String password, String email, boolean expected) {
        assertEquals(expected, accountRegister.registerAccount(username, password, email));
    }

    @ParameterizedTest
    @CsvSource({"abc,false", "null,false", "abcd12312,true", ",false"})
    void testPassword(String password, boolean expected) {
        System.out.println("ANBNSDJSDHSJBJBHJKFJKSFS");
        assertEquals(expected, AccountRegister.password(password));
    }
}
