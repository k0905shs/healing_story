package com.km.service;

import com.km.common.category.TestCode;
import com.km.model.PsyQuesDto;

import java.util.List;

public interface PsyTestService {

    List<PsyQuesDto.psyTest> getPsyTestByTestCode(final PsyQuesDto.testCodeParam testCodeParam);

}
