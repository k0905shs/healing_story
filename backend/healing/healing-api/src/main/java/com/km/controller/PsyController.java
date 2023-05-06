package com.km.controller;

import com.km.model.PsyQuesDto;
import com.km.service.PsyTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/psy/*")
public class PsyController {

    private final PsyTestService psyTestService;

    @PostMapping("test-list")
    public List<PsyQuesDto.psyTest> getPsyTest(@RequestBody PsyQuesDto.testCodeParam testCodeParam) {
        return psyTestService.getPsyTestByTestCode(testCodeParam);
    }

}
