package com.springboot.net.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberApi {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/members")
    public List<String> members(){
        return jdbcTemplate.queryForList("select EMAIL from member order by EMAIL", String.class);
    }
}
