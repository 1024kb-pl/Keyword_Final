package org.blog;

public class SuperUser extends User {
    private final String superPower;

    public SuperUser(String login, String password, String email, String superPower) {
        super(login, password, email);
        this.superPower = superPower;
    }

    public String getSuperPower() {
        return superPower;
    }
}
