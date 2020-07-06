package exceptions.excercise1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

@RunWith(Parameterized.class)
public class UserLoginRuleTest {

  private String login;

  public UserLoginRuleTest(String login) {
    this.login = login;
  }

  @Test
  public void shouldThrownExceptionWhenLoginIsSortenThan6Characters() {
    // when
    try {
      User user = User.create(login, "password", "firstname", "email");
      fail("Should thrown exception");
      // then
    } catch (Exception e) {
      assertThat(e).isInstanceOf(IllegalArgumentException.class);
      assertThat(e.getMessage()).isEqualTo("Minimal length of login is 6 characters");
    }
  }

  @Parameterized.Parameters(name = "Run {index}: login={0}")
  public static Iterable<Object[]> data() {
    return Arrays.asList(new Object[][]{
        {"l"},
        {"lo"},
        {"log"},
        {"logi"},
        {"login"}
    });
  }

}
