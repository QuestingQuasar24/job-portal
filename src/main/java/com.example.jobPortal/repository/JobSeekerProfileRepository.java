package com.example.jobPortal.repository;

import com.example.jobPortal.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerProfileRepository extends JpaRepository<JobSeekerProfile , Integer> {
}
