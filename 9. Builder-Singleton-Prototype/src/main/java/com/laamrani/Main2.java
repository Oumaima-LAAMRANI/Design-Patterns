package com.laamrani;

import com.laamrani.model.AccountStatus;
import com.laamrani.model.AccountType;
import com.laamrani.model.BankAccount;
import com.laamrani.model.Customer;

public class Main2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        // ca prend du temps
        BankAccount account = new BankAccount();
        account.setAccountId(1L);
        account.setCurrency("MAD");
        account.setType(AccountType.CURRENT_ACCOUNT);
        account.setStatus(AccountStatus.ACTIVATED);
        account.setBalance(20000);
        account.setCustomer(new Customer(1L,"Oumaima"));

        BankAccount account2 = new BankAccount();
        // ca prend du temps
        account2.setAccountId(account.getAccountId());
        account2.setCurrency(account.getCurrency());
        account2.setType(account.getType());
        account2.setStatus(account.getStatus());
        account2.setBalance(account.getBalance());
        //C'est plus rapide et ca consomme mois de ressources
        BankAccount account3 = account.clone();
        System.out.println(account);
        System.out.println(account3);
        System.out.println("*****************************************************");
        account3.getCustomer().setName("LAAMRANI");
        System.out.println(account);
        System.out.println(account3);


    }
}
