package com.laamrani;

import com.laamrani.model.AccountType;
import com.laamrani.model.BankAccount;
import com.laamrani.repository.AccountRepositoryImpl;
import com.laamrani.util.JsonSerializer;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        JsonSerializer<BankAccount> bankAccountJsonSerializer=new JsonSerializer<>();
        AccountRepositoryImpl accountRepository=AccountRepositoryImpl.getInstance();
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                accountRepository.populateData();
            }).start();
        }
        System.out.println("Tape");
        System.in.read();
        List<BankAccount> bankAccounts = accountRepository.findAll();        /*List<BankAccount> bankAccounts = accountRepository
                .searchAccounts(bankAccount ->
                        bankAccount.getType().equals(AccountType.CURRENT_ACCOUNT)&& bankAccount.getBalance()>1000        );*/
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