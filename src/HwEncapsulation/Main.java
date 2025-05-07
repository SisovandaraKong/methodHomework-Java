package HwEncapsulation;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new CreditAccount();
        Account acc2 = new SavingAccount();
        while (true){
            System.out.println("""
                    1. Deposit to Credit account
                    2. Deposit to Savings account
                    3. View all accounts
                    4. Exit program
                    """);
            System.out.print("[+] Please choose option: ");
            int opt = new Scanner(System.in).nextInt();
            if (opt == 1) {
                System.out.println("Deposit to Credit account");
                System.out.print("[+] Input your id: ");
                int id = new Scanner(System.in).nextInt();
                System.out.print("[+] Input your username: ");
                String username = new Scanner(System.in).nextLine();
                System.out.print("[+] Input your amount: ");
                double amount = new Scanner(System.in).nextDouble();
                System.out.print("[+] Input your email: ");
                String email = new Scanner(System.in).nextLine();
                System.out.print("[+] Input year expiredDate (YYYY): ");
                int year = new Scanner(System.in).nextInt();
                System.out.print("[+] Input month expiredDate (M): ");
                int month = new Scanner(System.in).nextInt();
                System.out.print("[+] Input day expiredDate (DD): ");
                int day = new Scanner(System.in).nextInt();
                acc1.setId(id);
                acc1.setUuid(UUID.randomUUID().toString());
                acc1.setUsername(username);
                acc1.setAmount(amount);
                acc1.setEmail(email);
                acc1.setCreatedAt(LocalDate.now());
                acc1.setExpiredAt(LocalDate.of(year, month, day));
            }
            else if (opt == 2) {
                System.out.println("Deposit to Saving account");
                System.out.print("[+] Input your id: ");
                int id = new Scanner(System.in).nextInt();
                System.out.print("[+] Input your username: ");
                String username = new Scanner(System.in).nextLine();
                System.out.print("[+] Input your amount: ");
                double amount = new Scanner(System.in).nextDouble();
                System.out.print("[+] Input your email: ");
                String email = new Scanner(System.in).nextLine();
                System.out.print("[+] Input year expiredDate (YYYY): ");
                int year = new Scanner(System.in).nextInt();
                System.out.print("[+] Input month expiredDate (M): ");
                int month = new Scanner(System.in).nextInt();
                System.out.print("[+] Input day expiredDate (DD): ");
                int day = new Scanner(System.in).nextInt();
                acc2.setId(id);
                acc2.setUuid(UUID.randomUUID().toString());
                acc2.setUsername(username);
                acc2.setAmount(amount);
                acc2.setEmail(email);
                acc2.setCreatedAt(LocalDate.now());
                acc2.setExpiredAt(LocalDate.of(year, month, day));
            }
            else if (opt == 3) {
                System.out.println("=".repeat(20));
                System.out.println("Deposit Account");
                System.out.println("Id: " + acc1.getId());
                System.out.println("UUID: " + acc1.getUuid());
                System.out.println("Username: " + acc1.getUsername());
                System.out.println("Amount: " + acc1.getAmount());
                System.out.println("Email: " + acc1.getEmail());
                System.out.println("CreatedAt: " + acc1.getCreatedAt());
                System.out.println("ExpiredAt: " + acc1.getExpiredAt());
                System.out.println("=".repeat(20));
                System.out.println("Saving Account");
                System.out.println("Id: " + acc2.getId());
                System.out.println("UUID: " + acc2.getUuid());
                System.out.println("Username: " + acc2.getUsername());
                System.out.println("Amount: " + acc2.getAmount());
                System.out.println("Email: " + acc2.getEmail());
                System.out.println("CreatedAt: " + acc2.getCreatedAt());
                System.out.println("ExpiredAt: " + acc2.getExpiredAt());
                System.out.println("=".repeat(20));
            }
            else if (opt == 4) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }
            else {
                System.out.println("[!] Invalid option");
            }
        }
    }
}
