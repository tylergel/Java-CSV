package com.example.springboot.entity;
import javax.persistence.*;
@Entity
@Table(name = "csv")
public class CsvInfo  {
    @Id
    private String A;
    public CsvInfo() {}
    public String getData() {
        return A;
    }
}
