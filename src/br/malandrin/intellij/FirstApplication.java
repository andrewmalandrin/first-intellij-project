package br.malandrin.intellij;

import br.malandrin.intellij.model.User;


public class FirstApplication {

    public static void main(String[] args) {

        User user = new User("Andrew Ferreira Andric Malandrin", "andrewmalandrin", "andrewmalandrin@malandrin.com.br", 30);

        String fullname = user.getFullname();
        String email = user.getEmail();
        String username = user.getUsername();

        System.out.println("Hello " + fullname);
        System.out.println("An e-mail has been sent to: " + email);
        System.out.println("Your username: " + username);

    }
}
