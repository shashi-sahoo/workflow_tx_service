package com.jsp.wftxservice.repository;

import com.jsp.wftxservice.model.TransactionLogModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionLogRepository extends JpaRepository<TransactionLogModel, Integer> {
}
