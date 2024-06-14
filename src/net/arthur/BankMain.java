package net.arthur;

import net.arthur.Bank.Account;
import net.arthur.Bank.Bank;
import net.arthur.Bank.Person;

public class BankMain {
    public static void main(String[] args) {

        Person pedro = new Person("Pedro","Arthur","Maciel",18);
        Bank personBank = new Bank("MinecraftsBank");

        personBank.openBankAccount(pedro,150);
        System.out.println(personBank.getAccountByPerson(pedro).getAccountBalance());
        personBank.withdrawAmount(10,pedro);
        System.out.println(personBank.getAccountByPerson(pedro).getAccountBalance());

    }
}
