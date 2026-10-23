package com.jsp.wftxservice.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class NodeConfig {

    Map<String, String> nodeProperties;
    String nodeId;
    String nodeType;
    List<String> outgoingNodes;
    List<String> incomingNodes;
    NodeConfig sourceNodeConfig;
    boolean isStartNode;
    boolean isEndNode;
}
