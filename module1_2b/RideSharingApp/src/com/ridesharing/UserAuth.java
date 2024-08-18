package com.ridesharing;

public class UserAuth {
    private static UserAuth instance;
    private boolean isAuthenticated;

    private UserAuth() {
        isAuthenticated = false;
    }

    public static synchronized UserAuth getInstance() {
        if (instance == null) {
            instance = new UserAuth();
        }
        return instance;
    }

    public void logIn() {
        isAuthenticated = true;
        System.out.println("User logged in.");
    }

    public void logOut() {
        isAuthenticated = false;
        System.out.println("User logged out.");
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }
}
