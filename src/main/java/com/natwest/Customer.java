package com.natwest;

import java.time.*;

public class Customer {
  private int customerId;
  private String firstName, lastName, address, city;
  private long phoneNumber;
  private LocalDateTime joiningDate;

  // default constructor
  public Customer() {
  }

  // parameterised constructor
  public Customer(int customerId, String firstName, String lastName, String address, String city, long phoneNumber,
      LocalDateTime joiningDate) {
    this.customerId = customerId;
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

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

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

  public LocalDateTime getJoiningDate() {
    return joiningDate;
  }

  public void setJoiningDate(LocalDateTime joiningDate) {
    this.joiningDate = joiningDate;
  }

}
