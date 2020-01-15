package com.example.springboot.controller;

import com.example.springboot.entity.CsvInfo;
import com.example.springboot.service.CsvService;
import com.example.springboot.repository.CsvRepository;
import java.util.List;
import java.util.*;
import java.io.BufferedReader;
import java.io.StringReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.transaction.annotation.Transactional;

@Controller
public class IndexController {
  @Autowired
    private CsvService csvService;


    @RequestMapping("/")
    @ResponseBody
    public ModelAndView home()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }

      @RequestMapping(value = "/upload",method= RequestMethod.POST)
      @ResponseBody
      public   List<CsvInfo> fileUpload (@RequestParam("file") MultipartFile file)
      {
        return csvService.saveCsvData(file);

        }

        @RequestMapping("/test")
        @ResponseBody
        public List<CsvInfo> homePage() {
          List<CsvInfo> csvList = csvService.getCsvInfo();
           return csvList;
        }





}
