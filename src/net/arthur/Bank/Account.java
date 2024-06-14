package net.arthur.Bank;

public class Account {
    private int accountBalance;
    private String accountID;
    private Person accountHolder;

    public Account(int accountBalance, String accountID, Person accountHolder) {
        this.accountBalance = accountBalance;
        this.accountID = accountID;
        this.accountHolder = accountHolder;
    }

    public int getAccountBalance() {
        return accountBalance;
    }
    public void depositAmount(int amount){
        accountBalance += amount;
    }
    public int withdrawAmount(int amount){
        accountBalance = accountBalance -  amount;
        return amount;
    }
    public boolean isAccountId(String id){
        return id.equals(this.accountID);
    }
    public boolean isAccountHolder(Person person){
        return accountHolder == person;
    }
}
