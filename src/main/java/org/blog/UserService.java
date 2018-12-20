package org.blog;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class UserService {
    protected final List<User> users = new LinkedList<>();

    public final void addUser(final User user) {
        users.add(user);
    }

    public Optional<User> getUser(User user) {
        return users.stream().filter(u -> u.getEmail().equals(user.getEmail())).findFirst();
    }
}
