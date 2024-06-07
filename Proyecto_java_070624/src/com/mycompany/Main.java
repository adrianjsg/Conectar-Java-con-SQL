package com.mycompany;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        // Crear usuarios
        userDAO.createUser("user1", "password1", "user1@example.com");
        userDAO.createUser("user2", "password2", "user2@example.com");
        userDAO.createUser("user3", "password3", "user3@example.com");

        // Leer usuarios
        List<User> users = userDAO.readUsers();
        for (User user : users) {
            System.out.println(user);
        }

        // Actualizar un usuario
        userDAO.updateUser(1, "updatedUser1", "updatedPassword1", "updatedUser1@example.com");

        // Leer usuarios después de la actualización
        users = userDAO.readUsers();
        for (User user : users) {
            System.out.println(user);
        }

        // Eliminar un usuario
        userDAO.deleteUser(2);

        // Leer usuarios después de la eliminación
        users = userDAO.readUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}


