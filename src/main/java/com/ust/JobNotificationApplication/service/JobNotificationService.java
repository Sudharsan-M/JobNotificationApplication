package com.ust.JobNotificationApplication.service;

import com.ust.JobNotificationApplication.model.JobInfo;
import com.ust.JobNotificationApplication.repository.JobNotificationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobNotificationService {
    @Autowired
    private JobNotificationRepo repo;

    public JobInfo addjob(JobInfo info){
        return repo.save(info);
    }

    public List<JobInfo> getjob(){
        return repo.findAll();
    }

    public JobInfo getjobbyid(Long id){
        return repo.findById(id).orElse(null);
    }

}
