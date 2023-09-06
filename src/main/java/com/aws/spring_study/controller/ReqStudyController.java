package com.aws.spring_study.controller;

import org.springframework.stereotype.Controller; // 서버사이드렌더링, 데이터 리턴이 가능
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ReqStudyController {

    @GetMapping("/test/get")
    public Object get() {
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("name", "김준일");
        dataMap.put("email", "aaa@gamil.com");
        return dataMap;
    }

    @PostMapping("/test/post")
    public Object post() {
        return null;
    }

    @PutMapping("/test/put")
    public Object put() {
        return "PUT";
    }

    @DeleteMapping("/test/delete")
    public Object delete() {
        return "DELETE";
    }


}
