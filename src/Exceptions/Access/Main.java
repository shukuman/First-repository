package Exceptions.Access;

import java.util.Scanner;

public class Main {
    public static User[] getUsers() {
            User user1 = new User("john", "jhon@gmail.com", "pass", 24);
            User user2 = new User("sam", "sam@mail.ru", "serious", 17);
            return new User[]{user1, user2};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if(login.equals(user.getLogin())) {
                if (password.equals(user.getPassword())) {
                    return user;
                } else {
                    throw new UserNotFoundException("Incorrect password");
                }
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() >= 18) {
            System.out.println("Access granted");
        } else {
            throw new AccessDeniedException("Access denied, your age is under 18");
        }
    }

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter login: ");
        String login = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        //Проверить логин и пароль
        getUserByLoginAndPassword(login, password);
        //Вызвать методы валидации пользователя
        validateUser(getUserByLoginAndPassword(login, password));
    }
}