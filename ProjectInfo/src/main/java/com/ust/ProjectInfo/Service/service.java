package com.ust.ProjectInfo.Service;

import com.ust.ProjectInfo.Repository.repository;
import com.ust.ProjectInfo.dto.projectDto;
import com.ust.ProjectInfo.model.project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service {

    @Autowired
    private repository r;

    public project addProject(projectDto dto) {
        project p = new project();
        p.setProjectId(dto.getProjectId());
        p.setProjectName(dto.getProjectName());
        p.setProjectStartDate(dto.getProjectStartDate());
        p.setProjectEndDate(dto.getProjectEndDate());
        p.setDescription(dto.getDescription());
        p.setTeamMembers(dto.getTeamMembers());
        p.setCompanyCode(dto.getCompanyCode());
        p.setCompanyName(dto.getCompanyName());
        p.setProjectBudget(dto.getProjectBudget());
        p.setProjectStatus(dto.getProjectStatus());
        p.setProjectManager(dto.getProjectManager());
        return r.save(p);
    }

    public List<project> getProject(long companyCode) {
        return r.findByCompanyCode(companyCode);
    }
}
