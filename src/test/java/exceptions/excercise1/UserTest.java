package exceptions.excercise1;

import org.assertj.core.api.AbstractAssert;
import org.junit.Test;

import java.time.LocalDate;

public class UserTest {

  @Test
  public void shouldCreateUser() {
    // when
    User user = User.create("login6", "password", "firstname", "email@email.pl");

    // then
    UserAssert.assertThat(user)
        .isCreationDateEquals(LocalDate.now())
        .isLoginEquals("login6")
        .isPasswordEquals("password")
        .isFirstnameEquals("firstname")
        .isEmailEquals("email@email.pl");
  }
}

class UserAssert extends AbstractAssert<UserAssert, User> {

  private UserAssert(User actual) {
    super(actual, UserAssert.class);
  }

  public static UserAssert assertThat(User user) {
    return new UserAssert(user);
  }

  public UserAssert isCreationDateEquals(LocalDate expected) {
    isNotNull();
    if (!actual.getCreationDate().equals(expected)) {
      failWithMessage("Expected creationDate to have %s but was %s",
          expected, actual.getCreationDate());
    }
    return this;
  }

  public UserAssert isEmailEquals(String expected) {
    isNotNull();
    if (!actual.getEmail().equals(expected)) {
      failWithMessage("Expected email to have %s but was %s",
          expected, actual.getEmail());
    }
    return this;
  }

  public UserAssert isFirstnameEquals(String expected) {
    isNotNull();
    if (!actual.getFirstname().equals(expected)) {
      failWithMessage("Expected firstName to have %s but was %s",
          expected, actual.getFirstname());
    }
    return this;
  }

  public UserAssert isPasswordEquals(String expected) {
    isNotNull();
    if (!actual.getPassword().equals(expected)) {
      failWithMessage("Expected creationDate to have %s but was %s",
          expected, actual.getPassword());
    }
    return this;
  }

  public UserAssert isLoginEquals(String expected) {
    isNotNull();
    if (!actual.getLogin().equals(expected)) {
      failWithMessage("Expected login to have %s but was %s",
          expected, actual.getLogin());
    }
    return this;
  }
}
