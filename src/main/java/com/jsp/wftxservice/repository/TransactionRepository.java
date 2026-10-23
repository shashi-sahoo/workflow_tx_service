package com.jsp.wftxservice.repository;

import com.jsp.wftxservice.model.TransactionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionModel, Integer> {
}
