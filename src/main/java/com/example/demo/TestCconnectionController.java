package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCconnectionController {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @GetMapping("/test")
    public String testConnection() {

        try {
            jdbcTemplate.execute("SELECT 1 FROM DUAL");
            return "Database connection successful.";
            //System.out.println("Database connection successful.");
        } catch (Exception e) {
            return "Database connection failed:  "+e.getMessage();

           // System.err.println("Database connection failed: " + e.getMessage());
        }





    }


}
