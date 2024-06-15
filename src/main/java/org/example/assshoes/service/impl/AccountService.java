package org.example.assshoes.service.impl;

import org.example.assshoes.dto.AccountDTO;
import org.example.assshoes.model.Account;
import org.example.assshoes.repository.AccountRepository;
import org.example.assshoes.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService {
    @Autowired
    AccountRepository AccountRepository;
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account createAccount(AccountDTO AccountDTO) {

        if (AccountRepository.existsByEmail(AccountDTO.getUsername())) {
            throw new RuntimeException("Account's fullname have already");
        }
        Account newAccount = Account.builder()

                .build();
        return AccountRepository.save(newAccount);
    }

    @Override
    public List<Account> getAllAccounts() {
        return null;
    }

    @Override
    public Account updateAccount(AccountDTO AccountDTO) {
        return null;
    }

    @Override
    public void deleteAccount(Long AccountID) {

    }

    @Override
    public AccountDTO login(String email, String password) {
        Account loginAccount = AccountRepository.findByEmail(email);
        if (loginAccount != null) {
            if (loginAccount.getPassword().equals(password)) {
                return AccountDTO.builder()
                        .id(loginAccount.getId())
                        .email(loginAccount.getEmail())
                        .avatar(loginAccount.getAvatar())
                        .username(loginAccount.getUsername())
                        .phonenumber(loginAccount.getPhonenumber())
                        .name(loginAccount.getName())
                        .build();
            }
        }
        return null;
    }


}
