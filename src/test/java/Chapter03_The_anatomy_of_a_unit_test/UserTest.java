package Chapter03_The_anatomy_of_a_unit_test;

import Chapter03_The_anatomy_of_a_unit_test.builders.UserTestDataBuilder;
import Chapter03_The_anatomy_of_a_unit_test.mothers.UserMother;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("Should create a valid user")
    void shouldCreatedValidUser() {
        User validUser = UserMother.createValidUser();

        assertEquals("USER", validUser.getRole());
        assertEquals(1, validUser.getId());
        assertTrue(validUser.isEmailVerified());
    }

    @Test
    @DisplayName("Should create an admin user")
    void shouldCreatedAdminUser() {
        User adminUser = UserMother.createActiveAdmin();

        assertEquals(1000L, adminUser.getId());
        assertEquals("ADMIN", adminUser.getRole());
    }

    @Test
    @DisplayName("Should create an unverified and locked user")
    void shouldCreatedLockedUnverifiedUser() {
        User lockedUser = UserMother.createLockedUnverifiedUser();

        assertFalse(lockedUser.isEmailVerified());
        assertTrue(lockedUser.isAccountLocked());
    }

    @Test
    @DisplayName("Should create a customized user with test data builder")
    void shouldCreateACustomizedUserWithTestDataBuilder(){
        User customUser = new UserTestDataBuilder()
                .name("Goku")
                .emailVerified(true)
                .role("SUPER SAYAJIN")
                .build();

        assertEquals("goku", customUser.getName().toLowerCase());
        assertTrue(customUser.isEmailVerified());
        assertEquals("super sayajin", customUser.getRole().toLowerCase());

        // just to prove the default builder works
        assertEquals("default@email.com", customUser.getEmail().toLowerCase());
        assertFalse(customUser.isAccountLocked());
    }
}