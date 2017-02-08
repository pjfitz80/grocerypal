package group4.tcss450.uw.edu.grocerypal450.models;

/**
 * This class is used to create Objects that represent a User.
 */
public class User {
    private String name;
    private String email;
    private String password;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String thePassword) {
        this.password = thePassword;
    }

    public String getPassword() {
        return password;
    }


}
