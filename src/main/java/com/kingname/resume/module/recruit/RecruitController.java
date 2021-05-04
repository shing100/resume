package com.kingname.resume.module.recruit;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/recruit")
@RequiredArgsConstructor
public class RecruitController {

    private final RecruitService recruitService;

    public ResponseEntity viewrecruitList() {
        
        return new ResponseEntity(HttpStatus.OK);
    }
}
