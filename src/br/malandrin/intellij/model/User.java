package br.malandrin.intellij.model;

public class User {

    private String fullname;
    private String username;
    private String email;
    private int idade;

    public User() {
    }

    public User(String fullname, String username, String email, int idade) {
        this.fullname = fullname;
        this.username = username;
        this.email = email;
        this.idade = idade;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
