package Hw2Principle;

public interface BankingService {
    void withdraw(double amount);
    void deposit(double amount);
    void transfer(Account account, double amount);
    void checkBalance();
    void transitionHistory();
}
