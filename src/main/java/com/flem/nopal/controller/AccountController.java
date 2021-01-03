package com.flem.nopal.controller;

import com.flem.nopal.model.Account;
import com.flem.nopal.model.UserDetails;
import com.flem.nopal.repository.AccountRepository;
import com.flem.nopal.repository.UserDetailsRepository;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AccountController {

    private final AccountRepository accountRepository ;
    private final UserDetailsRepository userDetailsRepository ;

    @Autowired
    public AccountController(AccountRepository accountRepository, UserDetailsRepository userDetailsRepository) {
        this.accountRepository = accountRepository;
        this.userDetailsRepository = userDetailsRepository;
    }

    @PostMapping("/add-account")
    public Account addAccount(@RequestBody Account account) {
        UserDetails userDetails = account.getLinkedUserDetails() ;
        account.setLinkedUserDetails(userDetailsRepository.save(userDetails));
        return accountRepository.save(account) ;
    }

    @GetMapping("/list-account")
    public List<Account> listAccount(){
        return (List<Account>) accountRepository.findAll();
    }

    @PutMapping("/update-account")
    public void updateAccount(@PathVariable int id ,@RequestBody Account account) {
        account.setId(id);
        accountRepository.save(account);
    }

    @DeleteMapping("/delete-account/{id}")
    public List<Account> deleteAccount(@PathVariable int id) {
         accountRepository.deleteById(id) ;
         return (List<Account>) accountRepository.findAll();
    }

    @PostMapping("/find-account-by-id")
    public Optional<Account> findAccountById(@RequestBody int id) {
        return accountRepository.findById(id) ;
    }

    @PostMapping("/find-by-login")
    public Account findAccountByLogin(@RequestBody String login) {
        return accountRepository.findByLogin(login);
    }

}
