package com.example.jpatest.controller;

import com.example.jpatest.domain.Accounts;
import com.example.jpatest.source.repository.SourceAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api")
public class AccountController {
    @Autowired
    SourceAccountRepository sourceAccountRepository;

    @PostMapping("/new-account")
    public String add(@RequestBody Accounts account){
        sourceAccountRepository.save(account);
        return "update OK";
    }
    @PostMapping("/delete-account")
    public String deleteById(@RequestBody Accounts account) {
        sourceAccountRepository.deleteById(account.getAccount_id());
        return "delete OK";
    }

    @PostMapping("/test")
    public String test() {
        return "test OK";
    }
    @GetMapping("/accounts")
    public List<Accounts> getAccounts(){
        return sourceAccountRepository.findAll();
    }
}
