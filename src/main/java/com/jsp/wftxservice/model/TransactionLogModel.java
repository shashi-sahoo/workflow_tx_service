package com.jsp.wftxservice.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JdbcType;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Map;
import java.util.Date;

@Data
@Entity
@Table(name = "tx_log_model")
public class TransactionLogModel extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alt_key")
    private int altKey;

    @Column(name = "tenant_id")
    private String tenantId;

    @Column(name = "tx_id")
    private String txId;

    @Column(name = "tx_unique_val")
    private String txUniqueVal;

    @Column(name = "workflow_id")
    private String workflowId;

    @Column(name = "current_node_id")
    private String currentNodeId;

    @Column(name = "current_node_type")
    private String currentNodeType;

    @Column(name = "status_flag")
    private String statusFlag;

    @Column(name = "execution_signal")
    private String executionSignal;

    @Column(name = "process_variable_datamap")
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, String> processVariableDataMap;

    @Column(name = "trigger_date")
    private Date triggerDate;

    @Column(name = "tx_start_date")
    @Temporal(TemporalType.DATE)
    private Date txStartDate;

    @Column(name = "tx_end_date")
    @Temporal(TemporalType.DATE)
    private Date txEndDate;
}
