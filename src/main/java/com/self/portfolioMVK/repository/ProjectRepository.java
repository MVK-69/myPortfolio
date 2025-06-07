package com.self.portfolioMVK.repository;

import com.self.portfolioMVK.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
