package com.example.springboot.repository;

import com.example.springboot.entity.CsvInfo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CsvRepository extends JpaRepository<CsvInfo, Integer> {

    @Query(value = "select * from csv", nativeQuery = true)
    List<CsvInfo> getCsvInfo();


}
