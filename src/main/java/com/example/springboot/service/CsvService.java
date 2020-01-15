
package com.example.springboot.service;

import com.example.springboot.entity.CsvInfo;
import com.example.springboot.repository.CsvRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Service
public class CsvService {

    private static final Logger logger = LoggerFactory.getLogger(CsvService.class);
    @Autowired
    public CsvRepository csvRepository;

    @Transactional
    public List<CsvInfo> saveCsvData(MultipartFile file) {
      List<CsvInfo> tosave = new ArrayList<>();
      List<CsvInfo> tocsv = new ArrayList<>();
      int success = 0;
      int fail = 0;
      int total = 0;
      try {
      byte[] bytes = file.getBytes();
      ByteArrayInputStream inputFilestream = new ByteArrayInputStream(bytes);
      BufferedReader br = new BufferedReader(new InputStreamReader(inputFilestream ));
      String line = "";

      while ((line = br.readLine()) != null) {
        if (total == 0) {
          //headers
          total = total + 1;
          continue;
        }
        total = total + 1;
        String [] data= line.split(",");
        CsvInfo c = new CsvInfo();

        if(data.length == 11) {
          c.setA(data[0]);
          c.setB(data[1]);
          c.setC(data[2]);
          c.setD(data[3]);
          c.setE(data[4] + data[5]);
          c.setF(data[6]);
          c.setG(data[7]);
          c.setH(data[8]);
          c.setI(data[9]);
          c.setJ(data[10]);
          if(data[0].equals(new String()) ||data[1].equals(new String()) || data[2].equals(new String())  || data[3].equals(new String())  || data[4].equals(new String()) || data[5].equals(new String()) || data[6].equals(new String()) || data[7].equals(new String())
          || data[8].equals(new String()) || data[9].equals(new String())|| data[10].equals(new String()) )
          {
            fail = fail + 1;
            tocsv.add(c);
          }
          else {
            csvRepository.save(c);
            success = success + 1;
            tosave.add(c);
          }
        } else {
           fail = fail + 1;
        }

      }
      br.close();
    }
    catch(IOException ex) {
    }
    //csvRepository.saveAll(tosave);
    logger.info("Received entries {}", total-1);
    logger.info("Successful entries {}", success);
    logger.info("Failed entries {}", fail);

    return tosave;

    }
    public List<CsvInfo> getCsvInfo() {
        List<CsvInfo> csv = new ArrayList<>();
        csvRepository.getCsvInfo().forEach((j) -> {
            csv.add(j);
        });
        return csv;
    }
}
