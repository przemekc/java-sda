package collections.excercise2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import static org.assertj.core.api.Assertions.assertThat;

public class ClinicTest {

  @Test
  public void shouldAddAndHandlePatient() {
    // given
    Clinic clinic = new Clinic();

    // when
    clinic.registerPatient("John");
    CountDownLatch countDownLatch = new CountDownLatch(1);
    String name = null;
    while (clinic.hasNextPatient()) {
      name = clinic.handlePatient();
      countDownLatch.countDown();
    }

    // then
    assertThat(name).isEqualTo("John");
    assertThat(clinic.hasNextPatient()).isFalse();
    assertThat(countDownLatch.getCount()).isEqualTo(0);
  }

  @Test
  public void shouldHandleAllPatients() {
    // given
    Clinic clinic = new Clinic();

    // when
    clinic.registerPatient("John");
    clinic.registerPatient("Bob");
    clinic.registerPatient("Mary");
    clinic.registerPatient("Emily");
    CountDownLatch countDownLatch = new CountDownLatch(4);
    List<String> names = new ArrayList<>();
    while (clinic.hasNextPatient()) {
      names.add(clinic.handlePatient());
      countDownLatch.countDown();
    }

    // then
    assertThat(names).contains("John", "Bob", "Mary", "Emily");
    assertThat(clinic.hasNextPatient()).isFalse();
    assertThat(countDownLatch.getCount()).isEqualTo(0);
  }
}
