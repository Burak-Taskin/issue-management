package com.burakt.issuemanagement.repository;

import com.burakt.issuemanagement.entity.Project;



import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.Sort;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List; //java.ut


public interface ProjectRepository extends JpaRepository<Project,Long> {
    Project getByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    Page<Project> findAll(Pageable pageable);

    List<Project> findAll(Sort sort);

    Project getByProjectCodeAndIdNot(String projectCode, Long id);
}
