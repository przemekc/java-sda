package exceptions.excercise1;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;

@Getter
public class User {

  private String login;
  private String password;
  private String firstname;
  private String email;
  private LocalDate creationDate;

  private User(String login, String password, String firstname, String email, LocalDate creationDate) {
    this.login = login;
    this.password = password;
    this.firstname = firstname;
    this.email = email;
    this.creationDate = creationDate;
  }

  public static User create(String login, String password, String firstname, String email) {
    if(StringUtils.isAnyEmpty(login, password, firstname, email)) {
      throw new IllegalArgumentException("All arguments are required");
    }

    if(login.length() < 6) {
      throw new IllegalArgumentException("Minimal length of login is 6 characters");
    }

    return new User(login, password, firstname, email, LocalDate.now());
  }


}
