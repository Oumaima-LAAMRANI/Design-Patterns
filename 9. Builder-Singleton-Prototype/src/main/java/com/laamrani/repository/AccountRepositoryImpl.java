package com.laamrani.repository;

import com.laamrani.model.AccountStatus;
import com.laamrani.model.AccountType;
import com.laamrani.model.BankAccount;
import com.laamrani.model.BankDirector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AccountRepositoryImpl implements AccountRepository {
    /*    1ere solution
    private static final AccountRepositoryImpl accountRepository;
    static {
        System.out.println("Singleton instantiation");
        accountRepository=new AccountRepositoryImpl();
    }
        2eme solution
      private static AccountRepositoryImpl accountRepository;
    */
    private static final AccountRepositoryImpl accountRepository;
    static {
        System.out.println("Singleton instantiation");
        accountRepository=new AccountRepositoryImpl();
    }
    private Map<Long, BankAccount> bankAccountMap=new HashMap<>();
    private long accountsCount=0;

    private AccountRepositoryImpl() {}

    @Override
    public BankAccount save(BankAccount bankAccount) {
        Long accountId;
        synchronized (this){
            accountId=++accountsCount; // Critical zone
        }
        bankAccount.setAccountId(accountId);
        synchronized (this){
            bankAccountMap.put(accountId,bankAccount); //si je le fais pas il se peut qu'une valeur soit ecrasé
        }
        //puisque il est difficile de detecter les zone critique,
        // on peut rendre cette methode syncronized
        return bankAccount;
    }

    @Override
    public List<BankAccount> findAll() {
        return bankAccountMap.values().stream().toList();
    }

    @Override
    public Optional<BankAccount> findById(Long id) {
        BankAccount account=bankAccountMap.get(id);
        if(account==null)
            return Optional.empty();
        return Optional.of(account);
    }

    @Override
    public List<BankAccount> searchAccounts(Predicate<BankAccount> predicate) {
        return bankAccountMap.values().stream().filter(predicate).toList();
    }

    @Override
    public BankAccount update(BankAccount bankAccount) {
        bankAccountMap.put(bankAccount.getAccountId(),bankAccount);
        return bankAccount;
    }

    @Override
    public void deleteById(Long id) {
        bankAccountMap.remove(id);
    }
    public void populateData(){
        for (int i = 0; i < 10; i++) {
            BankAccount bankAccount= BankDirector.accountBuilder()
                    .balance(100000+Math.random())
                    .type(Math.random()>0.9? AccountType.SAVING_ACCOUNT:AccountType.CURRENT_ACCOUNT)
                    .status(Math.random()>0.5?AccountStatus.CREATED:AccountStatus.ACTIVATED)
                    .currency(Math.random()>0.5?"MAD":"USD")
                    .build();
            save(bankAccount);

        }
        System.out.println("************************************");
        System.out.println(Thread.currentThread().getName());
        System.out.println("Account Count = "+accountsCount);
        System.out.println("Size = "+bankAccountMap.values().size());
        System.out.println("************************************");
    }
    public synchronized static AccountRepositoryImpl getInstance(){
        /* 2eme solution
        if(accountRepository==null)
            accountRepository=new AccountRepositoryImpl();*/
        return accountRepository;
    }
}
