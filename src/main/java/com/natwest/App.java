package com.natwest;

import java.util.*;
import java.time.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to NatWest banking!\nWould you like to continue banking with us?");
        String cont = sc.nextLine();
        if (!cont.equalsIgnoreCase("YES")) {
            sc.close();
            return;
        }

        System.out.println("\nEnter your customer details in , separator as follows\n" + //
                "First Name,LastName,Address,City,Phone Number,Joining Date(DD/MM/YYYY)");

        String details = sc.nextLine();
        // generate a customer object based on the details given
        Customer customer = Customer.generatorCustomer(details);
        System.out.println("Your customer details are:");
        System.out.println(customer.toString());

        // map to store the accounts with customer
        Map<Customer, List<Account>> customerMap = new HashMap<>();
        customerMap.put(customer, new ArrayList<Account>());

        // create the customer accounts
        while (true) {
            System.out.println("\nDo you want to create an account?");
            cont = sc.next();

            if (cont.equalsIgnoreCase("NO"))
                break;

            System.out.println("Select the account type from following\n" + //
                    " 1 Savings\n" + //
                    " 2 Salary");
            int accType = sc.nextInt();
            Category cat = new Category(accType);

            System.out.println("Enter the initial deposit amount:");
            double amount = sc.nextDouble();

            Account acc = new Account(-1, customer.getCustomerId(), amount, cat,
                    LocalDateTime.now());

            // add the account to the map
            customerMap.get(customer).add(acc);

            // print the account details
            System.out.println("Your account details are:");
            System.out.println(acc.toString());
        }

        // perform the transactions
        while (true) {
            System.out.println("\nDo you want to perform a transaction?");
            cont = sc.next();

            if (cont.equalsIgnoreCase("NO"))
                break;

            System.out.println("Select the Following Option\n" + //
                    " 1. Deposit\n" + //
                    " 2. Withdraw\n" + //
                    " 3. Transfer");
            int transactionType = sc.nextInt();

            String nextQuestion = "Enter the amount to ";
            if (transactionType == 1)
                nextQuestion += "deposit";
            else if (transactionType == 2)
                nextQuestion += "withdraw";
            else
                nextQuestion += "transfer";

            System.out.println(nextQuestion);
            double amount = sc.nextDouble();

            try {
                Transaction tr = new Transaction(amount, customerMap.get(customer).get(0).getAccountNumber(),
                        LocalDateTime.now());

                switch (transactionType) {
                    case 1:
                        System.out.println(tr.deposit(amount));
                        break;
                    case 2:
                        System.out.println(tr.withdraw(amount));
                        break;

                    case 3:
                        System.out.println(
                                tr.transferAmount(amount, customerMap.get(customer).get(0).getAccountNumber()));
                        break;

                    default:
                        break;
                }

                System.out.println("Transaction performed:");
                System.out.println(tr.toString());
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        sc.close();
    }
}
