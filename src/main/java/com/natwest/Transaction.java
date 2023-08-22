package com.natwest;

import java.time.*;

// custom exception to handle negative amount
class NegativeAmountException extends Exception {
  public NegativeAmountException(String s) {
    super(s);
  }
}

public class Transaction {
  private double amount;
  private long accountNumber;
  private LocalDateTime date;
  private final String NEGATIVE_AMOUNT_MSG = "Amount cannot be negative";

  // default constructor
  public Transaction() {
  }

  // parameterised constructor
  public Transaction(double amount, long accountNumber, LocalDateTime date) throws NegativeAmountException {
    if (amount < 0)
      throw new NegativeAmountException(NEGATIVE_AMOUNT_MSG);

    this.amount = amount;
    this.accountNumber = accountNumber;
    this.date = date;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) throws NegativeAmountException {
    if (amount < 0)
      throw new NegativeAmountException(NEGATIVE_AMOUNT_MSG);

    this.amount = amount;
  }

  public long getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(long accountNumber) {
    this.accountNumber = accountNumber;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "Transaction [amount=" + amount + ", accountNumber=" + accountNumber + ", date=" + date + "]";
  }

  public String withdraw(double amount) throws NegativeAmountException {
    if (amount < 0)
      throw new NegativeAmountException(NEGATIVE_AMOUNT_MSG);

    // we cannot actually handle the transaction without having access to the
    // account details, so I am just returning a success message here.
    // normally we would make a database query here to get the details of the
    // account, but we have no database here
    return "Transaction successful";
  }

  public String deposit(double amount) throws NegativeAmountException {
    if (amount < 0)
      throw new NegativeAmountException(NEGATIVE_AMOUNT_MSG);

    // we cannot actually handle the transaction without having access to the
    // account details, so I am just returning a success message here.
    // normally we would make a database query here to get the details of the
    // account, but we have no database here
    return "Transaction successful";
  }

  public String transferAmount(double amount, long accountNumber) throws NegativeAmountException {
    if (amount < 0)
      throw new NegativeAmountException(NEGATIVE_AMOUNT_MSG);

    // we cannot actually handle the transaction without having access to the
    // account details, so I am just returning a success message here.
    // normally we would make a database query here to get the details of the
    // account, but we have no database here
    return "Transaction successful";

  }
}
