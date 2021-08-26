package learn.example.java.myjavaapplication;

/**
 * Created by user on 3/6/2017.
 */

class BankAccount {
    int accountID;
    String holderName;
    double savingBalance;
    double fixedBalance;
    double totalBalance;

    void BankBalance(){
        totalBalance = savingBalance+fixedBalance;

    }
}
