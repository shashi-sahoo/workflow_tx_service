package com.jsp.wftxservice.dto;

import java.math.BigInteger;
import java.util.Date;

public class WorkflowTxContext {

    private Date executionStart;
    private Date executionEnd;
    private String executionStatus;
    private String remarks;
    private String tenantId;
    private BigInteger workflowAltKey;
    private String txId;
    private String workflowId;
    private String workflowCode;
    private String entityName;
    private boolean newTx;
    private boolean resumeTx;
    private String resumeTxNodeId;
    private String resumeNodeResultStatus;
    private NodeConfig nextNodeConfig;
    private String uniqueField;
}
