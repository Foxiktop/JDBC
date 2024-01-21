package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 44);
        userService.saveUser("Егор", "Егоров", (byte) 25);
        userService.saveUser("Петр", "Петров", (byte) 37);
        userService.saveUser("Борис", "Борисов", (byte) 20);

        List<User> listUsers = userService.getAllUsers();
        for (User user : listUsers) {
            System.out.println(user.toString());
        }


        userService.cleanUsersTable();

        userService.dropUsersTable();

    }

}



