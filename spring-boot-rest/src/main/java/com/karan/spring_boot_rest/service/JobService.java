package com.karan.spring_boot_rest.service;

import java.util.List;

import com.karan.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karan.spring_boot_rest.model.JobPost;

@Service
public class JobService {
    @Autowired
    public JobRepo repo;



    //method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return repo.returnAllJobPosts();


    }





    // ***************************************************************************





    // method to add a jobPost
    public void addJobPost(JobPost jobPost) {
        repo.addJobPost(jobPost);

    }


    public JobPost getJob(int postId) {
        return repo.getJob(postId);
    }

    public void updateJob(JobPost jobpost) {
        repo.updateJob(jobpost);
    }

    public void deleteJob(int postId) {
        repo.deleteJob(postId);
    }
}