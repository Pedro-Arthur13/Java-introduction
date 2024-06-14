package net.arthur.Bank;

import java.util.*;

public class Bank {
    private String name;
    private List<Account> accounts;
    private final int MinInitialDeposit = 50;


    public Bank(String name){
        this.name = name;
        accounts = new ArrayList<>();
    }
    public boolean withdrawAmount(int amount,Person person){
        if (getAccountByPerson(person).getAccountBalance() - amount < 0) {
            System.out.println("You don't have this money!");
            return false;
        }
        getAccountByPerson(person).withdrawAmount(amount);
        return true;

    }

    public Account getAccountByPerson(Person person){
        for(Account account: accounts ){
            if(account.isAccountHolder(person)){
                return account;
            }
        }
        return null;
    }
    public boolean openBankAccount(Person person, int initalDeposit){
        boolean bankAccountOppened = canOppenBankAccount(person,initalDeposit);
        if(bankAccountOppened){
            accounts.add(new Account(initalDeposit, getRandomId(),person));
        }
        return bankAccountOppened;

    }
    public String getRandomId(){
        Random random = new Random();
        String id = String.valueOf(random.nextInt(1000,9999));
        return  id;
    }
    private boolean canOppenBankAccount(Person person, int initialDeposit){
        boolean bankAccountOppened = false;
        if(person.isOldderThan(18)){
            System.out.println(person.getFullName() + " i'm sorry, you can't oppen an account!");
        }else{
            bankAccountOppened = true;
        }
        if(initialDeposit < MinInitialDeposit){
            System.out.println("This deposit of "+initialDeposit + " it's not enough. Need at least $"+MinInitialDeposit );
        }else {
            bankAccountOppened = true;
        }
        return bankAccountOppened;

    }
}
