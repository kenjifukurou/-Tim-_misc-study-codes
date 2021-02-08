package com.marsaint.arshiva;

public class Password {

    private static final int key = 4658913;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
        storePassword();
    }

    public int encryptDecrypt(int password) {
        int encrypted = password ^ key;
        return encrypted;
    }

    public void storePassword() {
        System.out.println("password saved as: " + this.encryptedPassword);
    }

    public boolean logIn(int password) {
        if (encryptDecrypt(password) == this.encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("incorrect password");
            return false;
        }
    }

}
