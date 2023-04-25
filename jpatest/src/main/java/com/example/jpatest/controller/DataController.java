package com.example.jpatest.controller;


import com.example.jpatest.domain.Accounts;
import com.example.jpatest.domain.Data;
import com.example.jpatest.source.repository.SourceDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api")
public class DataController {
    @Autowired
    SourceDataRepository sourceDataRepository;

    @PostMapping("/new-data")
    public String add(@RequestBody Data data){
        sourceDataRepository.save(data);
        return "update OK";
    }
    @PostMapping("/delete-data")
    public String deleteById(@RequestBody Data data) {
        sourceDataRepository.deleteById(data.getId());
        return "delete OK";
    }
    @GetMapping("/getdata")
    public List<Data> getData(){
        return sourceDataRepository.findAll();
    }
}
