package com.example.demo2.service;

import com.example.demo2.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public String getData(Long id) {
        Person person = new Person();
        person.setCode("bb");person.setName("dd");person.setId(22L);

        ValueOperations<String, Object> valueOper = redisTemplate.opsForValue();
        valueOper.set("b", person);
        Object value = (Object) valueOper.get("b");

        ValueOperations valueOper2 = stringRedisTemplate.opsForValue();
        valueOper2.set("c", "cccc");
        Object value2 = (Object) valueOper2.get("c");

        System.out.println("aaaaaa1");
        return "111";
    }
}
