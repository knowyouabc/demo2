package com.example.demo2.controller;

import com.example.demo2.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/")
public class DataController {

    @Autowired
    private DataService dataService;

    @Autowired
    private StringRedisTemplate redisTemplate;


    @RequestMapping(value = "getData", method = RequestMethod.GET)
    public String getData(@RequestParam Long id) {
        String re = dataService.getData(id);
        return "hello" + id;
    }
}
