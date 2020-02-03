package com.burakt.issuemanagement.service;

import com.burakt.issuemanagement.entity.Issue;
import com.burakt.issuemanagement.entity.IssueHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueHistoryService {

    IssueHistory save(IssueHistory issueHistory);

    IssueHistory getById(Long id);

    Page<IssueHistory> getAllPageable(Pageable pageable);

    Boolean delete (IssueHistory issueHistory);

}
