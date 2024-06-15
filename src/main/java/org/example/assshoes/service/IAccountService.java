package org.example.assshoes.service;

import org.example.assshoes.dto.AccountDTO;
import org.example.assshoes.model.Account;

import java.util.List;

public interface IAccountService {
    Account createAccount(AccountDTO AccountDTO);

    List<Account> getAllAccounts();

    Account updateAccount(AccountDTO AccountDTO);

    void deleteAccount(Long AccountID);

    AccountDTO login(String fullname, String password);
}
