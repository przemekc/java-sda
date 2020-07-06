package collections.excercise2;

import org.apache.log4j.Logger;

import java.util.LinkedList;
import java.util.Queue;

public class Clinic {

  private static final Logger LOGGER = Logger.getLogger(Clinic.class);

  private Queue<String> patients = new LinkedList<>();

  public void registerPatient(String patient) {
    LOGGER.info("Adding patient to queue " + patient);
    patients.add(patient);
  }

  public String handlePatient() {
    String poll = patients.poll();
    LOGGER.info("Handle patient " + poll);
    return poll;
  }

  public boolean hasNextPatient() {
    return !patients.isEmpty();
  }
}
