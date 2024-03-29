package com.burakt.issuemanagement.dto;

import com.burakt.issuemanagement.entity.IssueStatus;
import com.burakt.issuemanagement.entity.Project;
import com.burakt.issuemanagement.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class IssueDto {
    private Long id;
    private String description;
    private String details;
    private Date date;
    private IssueStatus issueStatus;
    private UserDto assignee;
    private ProjectDto project;


}
