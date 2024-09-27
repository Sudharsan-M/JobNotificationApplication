package com.ust.JobNotificationApplication.controller;

import com.ust.JobNotificationApplication.model.JobInfo;
import com.ust.JobNotificationApplication.service.JobNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.LongAccumulator;

@RestController
@RequestMapping("/ust")
public class JobNotificationController {
    @Autowired
    private JobNotificationService service;

    @PostMapping("/addjob")
    public JobInfo addjob(@RequestBody JobInfo info){
        return service.addjob(info);
    }

    @GetMapping("getjob")
    public List<JobInfo> getjob(){
        return service.getjob();
    }

    @GetMapping("/getjob/{id}")
    public JobInfo getjobbyid(@PathVariable Long id){
        return service.getjobbyid(id);
    }
}
