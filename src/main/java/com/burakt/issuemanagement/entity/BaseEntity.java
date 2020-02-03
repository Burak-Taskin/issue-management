package com.burakt.issuemanagement.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "created_by",length = 100)
    private String createdBy;
    @Column(name = "updated_by")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "updated_at",length = 100)
    private String uptdatedBy;
    @Column(name = "status")
    Boolean status;

}
