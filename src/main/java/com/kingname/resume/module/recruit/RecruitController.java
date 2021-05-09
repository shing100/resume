package com.kingname.resume.module.recruit;

import com.kingname.resume.module.recruit.response.Jobs;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Controller
@RequestMapping("/recruit")
@RequiredArgsConstructor
public class RecruitController {

    private final RecruitService recruitService;

    @GetMapping("/list")
    public ResponseEntity viewrecruitList(@Nullable @ModelAttribute RecruitDao recruitDao) {
        try {
            Jobs jobs = recruitService.saveRecruitList(recruitDao);
            return ResponseEntity.ok().body(jobs);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
