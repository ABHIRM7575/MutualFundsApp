package com.klef.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.klef.entity.MutualFund;
import com.klef.service.MutualFundService;

@RestController
@RequestMapping("/fundapi")
@CrossOrigin(origins = "*")
public class MutualFundController {

    @Autowired
    private MutualFundService mutualFundService;
    
    @PostMapping("/add")
    public ResponseEntity<MutualFund> addFund(@RequestBody MutualFund fund) {
        MutualFund saved = mutualFundService.addFund(fund);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<MutualFund>> getAllFunds() {
        List<MutualFund> funds = mutualFundService.getAllFunds();
        return new ResponseEntity<>(funds, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getFundById(@PathVariable int id) {
        MutualFund fund = mutualFundService.getFundById(id);
        if (fund != null) {
            return new ResponseEntity<>(fund, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Fund with ID " + id + " not found.", HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateFund(@RequestBody MutualFund fund) {
        MutualFund existing = mutualFundService.getFundById(fund.getFundId());
        if (existing != null) {
            MutualFund updated = mutualFundService.updateFund(fund);
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Cannot update. Fund with ID " + fund.getFundId() + " not found.", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFund(@PathVariable int id) {
        MutualFund existing = mutualFundService.getFundById(id);
        if (existing != null) {
            mutualFundService.deleteFundById(id);
            return new ResponseEntity<>("Fund with ID " + id + " deleted successfully.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Cannot delete. Fund with ID " + id + " not found.", HttpStatus.NOT_FOUND);
        }
    }
}
