package com.example.jpasink.controller;

import com.example.jpasink.domain.Accounts;
import com.example.jpasink.repository.SinkAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api")
public class AccountController {
    @Autowired
    SinkAccountRepository sinkAccountRepository;

//    @PostMapping("/new-account")
//    public String add(@RequestBody Accounts account){
//        sinkAccountRepository.save(account);
//        return "update OK";
//    }

    @GetMapping("/accounts")
    public List<Accounts> getAccounts(){
        return sinkAccountRepository.findAll();
    }
}
