package Chapter03_The_anatomy_of_a_unit_test.builders;

import Chapter03_The_anatomy_of_a_unit_test.User;

public final class UserTestDataBuilder {

    private Long id = 99L;
    private String name = "default builder";
    private String email = "default@email.com";
    private String role = "USER";
    private boolean isEmailVerified = true;
    private boolean isAccountLocked = false;

    public UserTestDataBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserTestDataBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UserTestDataBuilder role(String role) {
        this.role = role;
        return this;
    }

    public UserTestDataBuilder emailVerified(boolean isEmailVerified) {
        this.isEmailVerified = isEmailVerified;
        return this;
    }

    public UserTestDataBuilder accountLock(boolean isAccountLocked) {
        this.isAccountLocked = isAccountLocked;
        return this;
    }

    public User build() {
        User user = new User();
        user.setId(this.id);
        user.setName(this.name);
        user.setEmail(this.email);
        user.setRole(this.role);
        user.setEmailVerified(this.isEmailVerified);
        user.setAccountLocked(this.isAccountLocked);

        return user;
    }
}
