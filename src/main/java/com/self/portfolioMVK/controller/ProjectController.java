package com.self.portfolioMVK.controller;

import com.self.portfolioMVK.model.Project;
import com.self.portfolioMVK.service.ProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "http://localhost:5173")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public List<Project> getAllProjects(){
        return projectService.getAllProjects();
    }

    @PostMapping
    public Project createProject(@RequestBody Project project){
        return projectService.saveProject(project);
    }
}
