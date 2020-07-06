package exceptions.excercise2;

import exceptions.excercise1.User;
import org.junit.Test;

import static java.lang.System.out;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

public class LibraryTest {

  @Test
  public void shouldAddUserWhenNotExistsInLibrary_emptyLibrary() {
    // given
    Library library = new Library();

    // when
    try {
      User user = User.create("jan.kowalski", "pass", "jan", "jan.kowalski@email.pl");
      library.addUser(user);

      assertThat(library.getUserByLogin("jan.kowalski").get()).isEqualTo(user);
    } catch (UserAlreadyExistException e) {
      fail("Should not thrown exception");
    }
  }

  @Test
  public void shouldAddTwoUsersWitDiffrenLogins() {
    // given
    Library library = new Library();

    // when
    try {
      User user1 = User.create("jan.kowalski", "pass", "jan", "jan.kowalski@email.pl");
      library.addUser(user1);

      User user2 = User.create("jan.kowalski2", "pass", "jan", "jan.kowalski@email.pl");
      library.addUser(user2);

      assertThat(library.getUserByLogin("jan.kowalski").get()).isEqualTo(user1);
      assertThat(library.getUserByLogin("jan.kowalski2").get()).isEqualTo(user2);
    } catch (UserAlreadyExistException e) {
      fail("Should not thrown exception");
    }
  }

  @Test
  public void shouldThrownExceptionWhenUserAlreadExistsInLibrary() {
    // given
    Library library = new Library();

    // when
    try {
      library.addUser(User.create("jan.kowalski", "pass", "jan", "jan.kowalski@email.pl"));
      library.addUser(User.create("jan.kowalski", "pass", "jan", "jan.kowalski@email.pl"));
      fail();
    } catch (UserAlreadyExistException e) {
      out.println(e.getMessage());
    }
  }
}
