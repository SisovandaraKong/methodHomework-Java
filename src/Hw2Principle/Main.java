package Hw2Principle;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new SavingAccount();
        Account acc2 = new CreditCardAccount();
        System.out.println("=".repeat(20));
        System.out.println("== Please create account ==");
        System.out.print("[+] Input your id: ");
        int id = new Scanner(System.in).nextInt();
        System.out.print("[+] Input your name: ");
        String name = new Scanner(System.in).nextLine();
        acc1.setId(id);
        acc1.setUuid(UUID.randomUUID().toString());
        acc1.setName(name);
        acc1.setCreatedDate(LocalDate.now());
        acc1.setExpiredDate(acc1.getCreatedDate().plusYears(5));
        acc2.setId(id);
        acc2.setUuid(UUID.randomUUID().toString());
        acc2.setName(name);
        acc2.setCreatedDate(LocalDate.now());
        acc2.setExpiredDate(acc2.getCreatedDate().plusYears(5));
        while (true){
            System.out.println("""
                    =============================
                    1. Deposit
                    2. Withdraw
                    3. Transfer
                    4. Check Balance
                    5. View Transactions History
                    6. Exit
                    =============================
                    """);
            System.out.print("[+] Enter your choice: ");
            int opt = new Scanner(System.in).nextInt();
            if(opt == 1){
                System.out.println("Select Account");
                System.out.println("""
                        1. Saving Account
                        2. Credit Card Account
                        """);
                System.out.print("[+] Enter your choice: ");
                int choice = new Scanner(System.in).nextInt();
                if (choice == 1){
                    System.out.print("[+] Input your balance: ");
                    double balance = new Scanner(System.in).nextDouble();
                    acc1.deposit(balance);
                    acc1.setCreatedDate(LocalDate.now());
                    acc1.setExpiredDate(acc1.getCreatedDate().plusYears(5));
                } else if (choice == 2){
                    System.out.print("[+] Input your balance: ");
                    double balance = new Scanner(System.in).nextDouble();
                    acc2.deposit(balance);
                    acc2.setCreatedDate(LocalDate.now());
                    acc2.setExpiredDate(acc2.getCreatedDate().plusYears(5));
                }
                else{
                    System.out.print("Invalid account!");
                }
            }
            else if (opt == 2){
                System.out.println("Select Account");
                System.out.println("""
                        1. Saving Account
                        2. Credit Card Account
                        """);
                System.out.print("[+] Enter your choice: ");
                int choice = new Scanner(System.in).nextInt();
                if (choice == 1){
                    System.out.print("[+] Input your balance: ");
                    double balance = new Scanner(System.in).nextDouble();
                    acc1.withdraw(balance);
                    acc1.setCreatedDate(LocalDate.now());
                    acc1.setExpiredDate(acc1.getCreatedDate().plusYears(5));
                }
                else if (choice == 2){
                    System.out.print("[+] Input your balance: ");
                    double balance = new Scanner(System.in).nextDouble();
                    acc2.withdraw(balance);
                    acc2.setCreatedDate(LocalDate.now());
                    acc2.setExpiredDate(acc2.getCreatedDate().plusYears(5));
                }

            }
            else if (opt == 3){
                System.out.println("Select Account to Transfer");
                System.out.println("""
                        1. Saving Account to Credit Card Account
                        2. Credit Card Account to Saving Account
                        """);
                System.out.print("[+] Enter your choice: ");
                int choice = new Scanner(System.in).nextInt();
                if (choice == 1){
                    System.out.print("[+] Input your balance: ");
                    double balance = new Scanner(System.in).nextDouble();
                    acc1.transfer(acc2,balance);
                    acc1.setCreatedDate(LocalDate.now());
                    acc1.setExpiredDate(acc1.getCreatedDate().plusYears(5));
                }
                else if (choice == 2){
                    System.out.print("[+] Input your balance: ");
                    double balance = new Scanner(System.in).nextDouble();
                    acc2.transfer(acc1,balance);
                    acc2.setCreatedDate(LocalDate.now());
                    acc2.setExpiredDate(acc2.getCreatedDate().plusYears(5));
                }
            }
            else if (opt == 4){
                System.out.println("Check Account Balance");
                acc1.display();
                System.out.println("Saving Account Balance: ");
                acc1.checkBalance();
                System.out.println("Credit Card Account Balance: ");
                acc2.checkBalance();
            }
            else if (opt == 5){
                System.out.println("View Transactions History");
                System.out.println("Saving Account History: ");
                acc1.transitionHistory();
                System.out.println("Credit Card Account History: ");
                acc1.transitionHistory();
            }
            else if (opt == 6){
                System.out.println("Exit");
                System.exit(0);
            }
        }
    }
}
