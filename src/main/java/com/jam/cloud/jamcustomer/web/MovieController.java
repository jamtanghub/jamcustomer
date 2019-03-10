package com.jam.cloud.jamcustomer.web;

import com.jam.cloud.jamcustomer.data.ReContent;
import com.jam.cloud.jamcustomer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/movie")
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/id/{id}")
    public ReContent getById(@PathVariable Long id){
        ReContent reContent = this.restTemplate.getForObject("http://localhost:6080/server/user/id/" + id,ReContent.class);
        return reContent;
    }
}
