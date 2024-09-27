package com.ust.JobNotificationApplication.repository;

import com.ust.JobNotificationApplication.model.JobInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobNotificationRepo extends JpaRepository<JobInfo,Long> {
}
