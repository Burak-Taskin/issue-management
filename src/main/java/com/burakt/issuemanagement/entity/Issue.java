package com.burakt.issuemanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Data
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name = "issue")
public class Issue extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "description",length = 1000)
    private String description;
    @Column(name = "details", length = 4000)
    private String details;
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Column(name = "IssueStatus")
    @Enumerated(EnumType.STRING)
    private IssueStatus IssueStatus;
    @JoinColumn(name = "assignee_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User assignee;
    @JoinColumn(name = "project_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Project project;
}
