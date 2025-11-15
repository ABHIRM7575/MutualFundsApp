package com.klef.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.entity.MutualFund;
import com.klef.repository.MutualFundRepository;

@Service
public class MutualFundServiceImpl implements MutualFundService {

    @Autowired
    private MutualFundRepository mutualFundRepository;

    @Override
    public MutualFund addFund(MutualFund fund) {
        return mutualFundRepository.save(fund);
    }

    @Override
    public List<MutualFund> getAllFunds() {
        return mutualFundRepository.findAll();
    }

    @Override
    public MutualFund getFundById(int id) {
        Optional<MutualFund> opt = mutualFundRepository.findById(id);
        return opt.orElse(null);
    }

    @Override
    public MutualFund updateFund(MutualFund fund) {
        return mutualFundRepository.save(fund);
    }

    @Override
    public void deleteFundById(int id) {
        mutualFundRepository.deleteById(id);
    }
}
