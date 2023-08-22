package com.natwest;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Customer {
  private int customerId;
  private String firstName, lastName, address, city;
  private long phoneNumber;
  private LocalDate joiningDate;

  // default constructor
  public Customer() {
  }

  // parameterised constructor
  public Customer(int customerId, String firstName, String lastName, String address, String city, long phoneNumber,
      LocalDate joiningDate) {
    this.customerId = customerId == -1 ? generateId() : customerId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.city = city;
    this.phoneNumber = phoneNumber;
    this.joiningDate = joiningDate;
  }

  public int getCustomerId() {
    return customerId;
  }

  // customer ID cannot be modified
  /*
   * public void setCustomerId(int customerId) {
   * this.customerId = customerId;
   * }
   */

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public long getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public LocalDate getJoiningDate() {
    return joiningDate;
  }

  public void setJoiningDate(LocalDate joiningDate) {
    this.joiningDate = joiningDate;
  }

  @Override
  public String toString() {
    return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
        + address + ", city=" + city + ", phoneNumber=" + phoneNumber + ", joiningDate=" + joiningDate + "]";
  }

  // method to generate a random ID between 1 and 5000
  public int generateId() {
    return new Random().nextInt(5000) + 1;
  }

  // static method to convert customer string to customer object
  public static Customer generatorCustomer(String customerString) {
    // String passed to this method will look as follows
    // firstName + "," + lastName + "," + address + "," + city +
    // "," + phoneNumber + "," + joiningDate;
    String[] parts = customerString.split(",");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    return new Customer(
        -1,
        parts[0],
        parts[1],
        parts[2],
        parts[3],
        Long.parseLong(parts[4]),
        LocalDate.parse(parts[5], formatter));
  }

}
