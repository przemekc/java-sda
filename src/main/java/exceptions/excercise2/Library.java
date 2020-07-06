package exceptions.excercise2;

import exceptions.excercise1.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Library {

  private final Map<String, User> users = new HashMap<>();

  public void addUser(User user) throws UserAlreadyExistException {
    if (userExists(user)) {
      throw new UserAlreadyExistException("User already exists");
    }
    users.put(user.getLogin(), user);
  }

  private boolean userExists(User user) {
    return users.containsKey(user.getLogin());
  }

  public Optional<User> getUserByLogin(String login) {
    return Optional.ofNullable(users.get(login));
  }
}
