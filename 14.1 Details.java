package learn.example.java.myjavaapplication;

/**
 * Created by user on 3/6/2017.
 */

class Details {
    public static void main(String[] args) {
        BankAccount rose = new BankAccount();
        rose.accountID =10;
        rose.holderName= "Rose Jose";
        rose.fixedBalance =4000.00;
        rose.savingBalance=5000.00;
        rose.BankBalance();
        System.out.println("Rose's total Bank balance is " +rose.totalBalance);

        BankAccount Mary =  new BankAccount();
        Mary.accountID =20;
        Mary.holderName= "Mary Patrick";
        Mary.fixedBalance =3000.00;
        Mary.savingBalance=8000.00;
        Mary.BankBalance();
        System.out.println("Mary's total Bank balance is " +Mary.totalBalance);
    }

}
