package jm.task.core.jdbc;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

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



