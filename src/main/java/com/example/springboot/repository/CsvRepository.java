package com.example.springboot.repository;

import com.example.springboot.entity.CsvInfo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CsvRepository extends CrudRepository<CsvInfo, String> {

    @Query(value = "select * from csv", nativeQuery = true)
    List<CsvInfo> getCsvInfo();


}
