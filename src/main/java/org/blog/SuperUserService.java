package org.blog;

import org.springframework.util.Assert;

import java.util.Optional;

public class SuperUserService extends UserService {

    @Override
    public Optional<User> getUser(User user) {
        Assert.notNull(user, "User cannot be null!");
        Assert.hasText(user.getEmail(), "Email cannot be empty!");

        return getUser(user);
    }

    @Override
    public void addUser(User user) {
        Assert.notNull(user, "User cannot be null!");

        super.addUser(user);
    }

}
