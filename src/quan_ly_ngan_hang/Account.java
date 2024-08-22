package quan_ly_ngan_hang;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private static final double LAISUAT = 0.035;
    private long accountNumber;
    private String accountName;
    private double balance;

    public Account() {
        this.accountNumber = 0;
        this.accountName = "";
        this.balance = 50;
    }

    public Account(long accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }


    public Account(long accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 50;
    }


    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Số tiền nạp vào phải lớn hơn 0.");
        }
    }

    public void withdraw(double amount, double fee) {
        if (amount > 0 && (amount + fee) <= balance) {
            balance -= (amount + fee);
        } else {
            System.out.println("Số tiền rút không hợp lệ hoặc số tiền rút cộng phí lớn hơn số tiền hiện tại.");
        }
    }


    public void accrueInterest() {
        balance += balance * LAISUAT;
    }

    public void transfer(Account target, double amount) {
        if (target != null && amount > 0 && amount <= balance) {
            this.withdraw(amount, 0);
            target.deposit(amount);
        } else {
            System.out.println("Số tiền chuyển không hợp lệ hoặc số dư không đủ.");
        }
    }

    @Override
    public String toString() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.getDefault());
        return String.format("Số tài khoản: \nTên tài khoản: \nSố tiền trong tài khoản:",
                accountNumber, accountName, currencyFormat.format(balance));
    }

}
