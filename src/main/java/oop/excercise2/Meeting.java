package oop.excercise2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// mozna tez lombokiem
//@Getter
//@Setter
public class Meeting {

  private String description;
  private LocalDate date;
  private String address;
  private int size;

  public Meeting(String description, String address) {
    this.description = description;
    this.address = address;
    this.date = LocalDate.now();
    this.size = 18;
  }

  public Meeting(String description, LocalDate date, String address, int size) {
    this.description = description;
    this.date = date;
    this.address = address;
    this.size = size;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public void delayMeeting(int days) {
    this.date = this.date.plusDays(days);
  }

  public String details() {
    return description + ", " +
        date.format(DateTimeFormatter.ISO_LOCAL_DATE) + ", " +
        address + ", "
        + size;
  }
}
