package com.km.service;

import com.km.model.PsyQuesDto;

import java.util.List;

public interface PsyTestService {

    List<PsyQuesDto.psyTest> getPsyTestByTestCode(final PsyQuesDto.testCodeParam testCodeParam);

    int saveTestResult(final PsyQuesDto.testResultParam testResultParam);

}
