package collections.excercise2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ClinicTest {

  @Test
  public void shouldAddAndHandlePatient() {
    // given
    Clinic clinic = new Clinic();

    // when
    clinic.registerPatient("John");
    int patientCount = 0;
    String name = null;
    while (clinic.hasNextPatient()) {
      name = clinic.handlePatient();
      patientCount++;
    }

    // then
    assertThat(name).isEqualTo("John");
    assertThat(clinic.hasNextPatient()).isFalse();
    assertThat(patientCount).isEqualTo(1);
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
    int patientCount = 0;
    List<String> names = new ArrayList<>();
    while (clinic.hasNextPatient()) {
      names.add(clinic.handlePatient());
      patientCount++;
    }

    // then
    assertThat(names).contains("John", "Bob", "Mary", "Emily");
    assertThat(clinic.hasNextPatient()).isFalse();
    assertThat(patientCount).isEqualTo(4);
  }
}
