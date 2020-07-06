package exceptions.excercise1;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

@RunWith(Parameterized.class)
public class UserAllFieldRuleTest {

  private String login;
  private String password;
  private String firstname;
  private String email;

  public UserAllFieldRuleTest(String login, String password, String firstname, String email) {
    this.login = login;
    this.password = password;
    this.firstname = firstname;
    this.email = email;
  }

  @Test
  public void shouldThrowExceptionWhenAllParametersAreNotSet() {
    // when
    try {
      User user = User.create(login, password, firstname, email);
      fail("Should thrown exception");
      // then
    } catch (Exception e) {
      assertThat(e).isInstanceOf(IllegalArgumentException.class);
      assertThat(e.getMessage()).isEqualTo("All arguments are required");
    }
  }

  @Parameterized.Parameters(name = "Run {index}: login={0}, password={1}, firstname={2}, email={3}")
  public static Iterable<Object[]> data() {
    return Arrays.asList(new Object[][]{
        {null, "password", "firstname", "email"},
        {"login", null, "firstname", "email"},
        {"login", "password", null, "email"},
        {"login", "password", "firstname", null},
        {"", "password", "firstname", "email"},
        {"login", "", "firstname", "email"},
        {"login", "password", "", "email"},
        {"login", "password", "firstname", ""}
    });
  }

}
