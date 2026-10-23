package com.jsp.wftxservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "tx_model")
public class TransactionModel extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alt_key")
    private int altKey;

    @Column(name = "tenant_id")
    private String tenantId;

    @Column(name = "tx_id")
    private String txId;

    @Column(name = "tx_unique_value")
    private String txUniqueValue;

    @Column(name = "workflow_id")
    private String workflowId;

    @Column(name = "workflow_code")
    private String workflowCode;

    @Column(name = "status_flag")
    private String statusFlag;

    @Column(name = "tx_start_date")
    @Temporal(TemporalType.DATE)
    private Date txStartDate;

    @Column(name = "tx_end_date")
    @Temporal(TemporalType.DATE)
    private Date txEndDate;

    @Column(name = "remarks")
    private String remarks;
}
