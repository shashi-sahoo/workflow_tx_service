package com.jsp.wftxservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.util.Date;

@MappedSuperclass
@Data
public class AuditModel {

    @Column(name = "create_date")
    private Date createdDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "modified_date")
    private  Date modifiedDate;

    @Column(name = "modified_by")
    private  String modifiedBy;

}
