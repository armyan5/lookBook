package com.lookBook.tests;

public class Register {
    private String login;
    private String password;

    public Register setLogin(String login) {
        this.login = login;
        return this;
    }

    public Register setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
