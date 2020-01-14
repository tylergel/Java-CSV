package com.example.springboot.controller;

import com.example.springboot.entity.CsvInfo;
import com.example.springboot.service.CsvService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {


    @Autowired
    private CsvService csvService;

    @RequestMapping("/")
    public List<CsvInfo> homePage() {
      List<CsvInfo> csvList = csvService.getCsvInfo();
       return csvList;
    }
    @RequestMapping("/t")
    public String test() {
        return "TEST";
    }



}
