package com.klef.service;

import java.util.List;
import com.klef.entity.MutualFund;

public interface MutualFundService {
    MutualFund addFund(MutualFund fund);
    List<MutualFund> getAllFunds();
    MutualFund getFundById(int id);
    MutualFund updateFund(MutualFund fund);
    void deleteFundById(int id);
}
