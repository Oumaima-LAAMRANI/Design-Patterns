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
    private Map<Long, BankAccount> bankAccountMap=new HashMap<>();
    private long accountsCount=0;
    @Override
    public BankAccount save(BankAccount bankAccount) {
        Long accountId=++accountsCount;
        bankAccount.setAccountId(accountId);
        bankAccountMap.put(accountId,bankAccount);
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
                    .type(Math.random()>0.9? AccountType.SAVING_ACCOUNT:AccountType.SAVING_ACCOUNT)
                    .status(Math.random()>0.5?AccountStatus.CREATED:AccountStatus.ACTIVATED)
                    .currency(Math.random()>0.5?"MAD":"USD")
                    .build();
            save(bankAccount);
        }
    }
}
