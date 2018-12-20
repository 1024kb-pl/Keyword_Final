package org.blog;

public class Main {

    public static void transformUser(final User user) {
        user = new User("Pablo", "pablo1", "pablo@example.com");
    }

    public static void main(String[] args) {
	    final User user = new User("Pablo", "pablo1", "pablo@example.com");
	    user.setLogin("NewPablo");

	    //user = new User("newPablo", "pablo2", "pablo@example.com");


    }
}
