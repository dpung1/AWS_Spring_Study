package com.aws.spring_study.controller;

import com.aws.spring_study.dto.JsonTestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.aws.spring_study.dto.xWwwTestDto;

@RestController
public class PostController {
    @PostMapping("/post/xwww")
    public Object xWwwFormUrlEncoded(xWwwTestDto xWwwTestDto) {
        System.out.println(xWwwTestDto);
        return null;
    }

    @PostMapping("/post/json")
    // json 형식일 경우 @RequestBody가 있어야함
    public Object json(@RequestBody JsonTestDto jsonTestDto) {
        System.out.println(jsonTestDto);
        return null;
    }
}
