package collections.excercise4;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@EqualsAndHashCode
@RequiredArgsConstructor
public class Student {

  private final String firstname;
  private final String lastname;
  private final String mainLeague;

  public String getName() {
    return firstname + " " + lastname;
  }
}
