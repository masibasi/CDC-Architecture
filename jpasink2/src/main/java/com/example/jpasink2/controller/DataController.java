package com.example.jpasink2.controller;

import com.example.jpasink2.domain.Data;
import com.example.jpasink2.repository.SinkDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api")
public class DataController {
    @Autowired
    SinkDataRepository sinkDataRepository;

//    @PostMapping("/new-data")
//    public String add(@RequestBody Data data){
//        sinkDataRepository.save(data);
//        return "update OK";
//    }
    @GetMapping("/getdata")
    public List<Data> getData(){
        return sinkDataRepository.findAll();
    }
}
