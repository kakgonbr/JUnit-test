import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

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
    @ParameterizedTest
    void testAccountRegistration(String username, String password, String email, boolean expected) {
        assertEquals(expected, accountRegister.registerAccount(username, password, email));
    }
}
