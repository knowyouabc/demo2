package com.example.demo2.service;

import com.example.demo2.model.Person;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;


@CacheConfig(cacheNames = "cacheTest")
@Component
public class CacheServiceImpl implements CacheService {

    @Override
    @Cacheable(key = "#name")
    public Person getPerson(String name) {
        Person person = new Person();
        person.setCode("cache");person.setName(name);person.setId(33L);
        return person;
    }
}
