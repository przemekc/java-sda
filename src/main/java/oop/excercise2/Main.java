package oop.excercise2;

import java.util.Random;

import static java.lang.System.out;

public class Main {

  public static void main(String[] args) {
    Meeting meeting1 = new Meeting("Java Poznań 1", "Rynek Jezycki 1, Poznan");
    Meeting meeting2 = new Meeting("Java Poznań 2", "Rynek Jezycki 1, Poznan");

    out.println(meeting1.details());
    out.println(meeting2.details());
    out.println("Delaing meeting 2");
    meeting2.delayMeeting(14);
    out.println("After delay");
    out.println(meeting2.details());

    Meeting m1 = new Meeting("Java Poznań 1", "Rynek Jezycki 1, Poznan");
    Meeting m2 = new Meeting("Java Poznań 2", "Rynek Jezycki 1, Poznan");
    Meeting m3 = new Meeting("Java Poznań 1", "Rynek Jezycki 1, Poznan");
    Meeting m4 = new Meeting("Java Poznań 2", "Rynek Jezycki 1, Poznan");

    Meeting[] calendar = new Meeting[]{m1, m2, m3, m4};

    out.println("setting random size");

    for (Meeting meeting : calendar) {
      meeting.setSize(getRandomSize());
    }

    out.println("My calendar");
    for (Meeting meeting : calendar) {
      out.println(meeting.details());
    }
  }

  private static int getRandomSize() {
    Random random = new Random();
    return random.nextInt((80 - 50) + 1) + 50;
  }
}
