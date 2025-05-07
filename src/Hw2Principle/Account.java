package Hw2Principle;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Data

public class Account implements BankingService {
    private Integer id;
    private String uuid;
    private String name;
    private double balance;
    private LocalDate createdDate;
    private LocalDate expiredDate;
    private String history;
    @Override
    public void transitionHistory() {
        System.out.println("Your transaction history is: " + history);
    }

    @Override
    public void checkBalance() {
        System.out.println("Your balance is " + balance);

    }

    @Override
    public void transfer(Account account, double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            account.balance += amount;
            history = "Transfer $" + amount +  " successfully";
            System.out.println(history);
        } else {
            System.out.println("Not enough balance to transfer.");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            history = "Deposited: $" + amount;
            System.out.println(name + " deposited $" + amount);
            System.out.println("| New Balance: $" + balance+ "|");
        }
        else {
            System.out.println("Cannot deposit negative amount or 0");
        }
    }

    @Override
    public void withdraw(double amount) {
    if (balance >= amount) {
        balance -= amount;
        System.out.println(name + " withdrew $" + amount);
        System.out.println("| New Balance: $" + balance+ "|");
    }
    else {
        System.out.println("Cannot withdraw negative amount or 0");
    }
    }
    public void display() {
        System.out.println("Account ID: " + id);
        System.out.println("Account UUID: " + uuid);
        System.out.println("Account Name: " + name);
        System.out.println("Account Balance: " + balance);
        System.out.println("Account Created: " + createdDate);
        System.out.println("Account Expired: " + expiredDate);
    }
}
