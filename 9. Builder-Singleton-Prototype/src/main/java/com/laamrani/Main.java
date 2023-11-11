package com.laamrani;

import com.laamrani.model.AccountStatus;
import com.laamrani.model.AccountType;
import com.laamrani.model.BankAccount;
import com.laamrani.model.BankDirector;
import com.laamrani.repository.AccountRepository;
import com.laamrani.repository.AccountRepositoryImpl;
import com.laamrani.util.JsonSerializer;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        JsonSerializer<BankAccount> bankAccountJsonSerializer=new JsonSerializer<>();
        AccountRepositoryImpl accountRepository=new AccountRepositoryImpl();
        accountRepository.populateData();
        List<BankAccount> bankAccounts = accountRepository.searchAccounts(
                new Predicate<BankAccount>() {
                    @Override
                    public boolean test(BankAccount bankAccount) {
                        return bankAccount.getType().equals(AccountType.CURRENT_ACCOUNT);
                    }
                }
        );
        bankAccounts.stream()
                .map(bankAccountJsonSerializer::toJson)
                .forEach(System.out::println);
       /* System.out.println("============================");
        BankAccount account = accountRepository.findById(1L).orElse(null);
        if(account!=null){
            System.out.println(bankAccountJsonSerializer.toJson(account));
        }*/
    }
}