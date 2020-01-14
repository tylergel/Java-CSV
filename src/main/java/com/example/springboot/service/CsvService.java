
package com.example.springboot.service;

import com.example.springboot.entity.CsvInfo;
import com.example.springboot.repository.CsvRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CsvService {

    @Autowired
    private CsvRepository csvRepository;

    public List<CsvInfo> getCsvInfo() {
        List<CsvInfo> csv = new ArrayList<>();
        csvRepository.getCsvInfo().forEach((j) -> {
            csv.add(j);
        });
        return csv;
    }
}
