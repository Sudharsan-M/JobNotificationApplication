package com.ust.JobNotificationApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "jobinfo")
public class JobInfo {
    @Id
    private long jobId;
    private String jobTitle;
    private String description;
    private String location;
    private long salary;
}
