package com.burakt.issuemanagement.service;

import com.burakt.issuemanagement.dto.IssueDto;
import com.burakt.issuemanagement.entity.Issue;
import com.burakt.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(Long issue);

    IssueDto update(Long id, IssueDto project);
}
