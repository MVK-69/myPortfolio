package com.self.portfolioMVK.service;

import com.self.portfolioMVK.model.Project;
import com.self.portfolioMVK.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects(){
        return projectRepository.findAll();
    }

    public Project saveProject(Project project){
        return projectRepository.save(project);
    }
}
