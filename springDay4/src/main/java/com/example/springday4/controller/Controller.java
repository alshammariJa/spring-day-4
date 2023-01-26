package com.example.springday4.controller;

import com.example.springday4.Pojo.Employees;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/employees/v1")
public class Controller {

    ArrayList <Employees> arrayEmployees = new ArrayList<>();

    @GetMapping("/get")
    public ArrayList<Employees> getEmployees(){
        return arrayEmployees;
    }

    @PostMapping("/add")
    public String addEmployees(@Valid  @RequestBody Employees employees ){
        arrayEmployees.add(employees);
        return " add done";

    }

    @PutMapping("/update/{index}")
    public String updateEmployees( @Valid Employees employees,@PathVariable int index  ){
        arrayEmployees.set(index,employees);
        return "update done";

    }
    @DeleteMapping("/delete/{index}")
    public String deleteEmployees( @PathVariable int index ){
        arrayEmployees.remove(index);
       return "delete done";
    }

//    @PutMapping("/apply/{id}")
//    public String applyAnnual(@Valid Employees employees,@PathVariable int index ){
//
//    }
//}

