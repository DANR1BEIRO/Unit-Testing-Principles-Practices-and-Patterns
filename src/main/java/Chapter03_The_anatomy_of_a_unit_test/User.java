package Chapter03_The_anatomy_of_a_unit_test;

public class User {
    private Long id;
    private String name;
    private String email;
    private String role; // e.g.: admin, standard user, etc
    private boolean isEmailVerified;
    private boolean isAccountLocked;

    public User() {
    }

    public User(Long id, String name, String email, String role, boolean isEmailVerified, boolean isAccountLocked) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.isEmailVerified = isEmailVerified;
        this.isAccountLocked = isAccountLocked;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isEmailVerified() {
        return isEmailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        isEmailVerified = emailVerified;
    }

    public boolean isAccountLocked() {
        return isAccountLocked;
    }

    public void setAccountLocked(boolean accountLocked) {
        isAccountLocked = accountLocked;
    }
}
