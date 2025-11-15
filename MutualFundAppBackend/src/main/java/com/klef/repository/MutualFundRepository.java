package com.klef.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.klef.entity.MutualFund;

@Repository
public interface MutualFundRepository extends JpaRepository<MutualFund, Integer> {
    // add custom finders later if required
}
