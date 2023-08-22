package com.natwest;

import java.time.*;

public class Account {
  private int accountNumber, customerId;
  private double accountBalance;
  private Category accountType;
  private LocalDateTime dateOpened;

  // default constructor
  public Account() {
  }

  // parameterised constructor
  public Account(int accountNumber, int customerId, double accountBalance, Category accountType,
      LocalDateTime dateOpened) {
    this.accountNumber = accountNumber;
    this.customerId = customerId;
    this.accountBalance = accountBalance;
    this.accountType = accountType;
    this.dateOpened = dateOpened;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public double getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(double accountBalance) {
    this.accountBalance = accountBalance;
  }

  public Category getAccountType() {
    return accountType;
  }

  public void setAccountType(Category accountType) {
    this.accountType = accountType;
  }

  public LocalDateTime getDateOpened() {
    return dateOpened;
  }

  public void setDateOpened(LocalDateTime dateOpened) {
    this.dateOpened = dateOpened;
  }

  @Override
  public String toString() {
    return "Account [accountNumber=" + accountNumber + ", customerId=" + customerId + ", accountBalance="
        + accountBalance + ", accountType=" + accountType + ", dateOpened=" + dateOpened + "]";
  }

  public static Account generateAccount(String accString) {
  }
}
