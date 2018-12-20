package org.blog;

public class Main {

    public static void displayUser(final User user) {
        System.out.print(user);
        user = new User("Pablo", "pablo1", "pablo@example.com");
    }

    public static User transformUserWithReturn(final User user) {
        user.setLogin("NOWY LOGIN!");
        return user;
    }

    public static User transformUser(final User user) {
        user.setLogin("INNY LOGIN!");
    }

    public static void main(String[] args) {
	    final String name = "pablo";
	    name = "Johny";



    }
}
