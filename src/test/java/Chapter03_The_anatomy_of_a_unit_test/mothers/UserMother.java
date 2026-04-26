package Chapter03_The_anatomy_of_a_unit_test.mothers;

import Chapter03_The_anatomy_of_a_unit_test.User;

public class UserMother {

    public static User createValidUser() {
        User user = new User();
        user.setId(1L);
        user.setName("Daniel");
        user.setEmail("daniel@email.com");
        user.setRole("USER");
        user.setEmailVerified(true);
        user.setAccountLocked(false);
        return user;
    }

    public static User createActiveAdmin() {
        User user = createValidUser();
        user.setId(1000L);
        user.setRole("ADMIN");
        return user;
    }

    public static User createLockedUnverifiedUser() {
        User user = createValidUser();
        user.setEmailVerified(false);
        user.setAccountLocked(true);
        return user;
    }
}
