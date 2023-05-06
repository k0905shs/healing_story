package com.km.repository.psyQues;

import com.km.common.category.TestCode;
import com.km.entity.PsyQues;
import com.km.model.PsyQuesDto;

import java.util.List;

public interface PsyQuesRepositorySupport {

    List<PsyQuesDto.psyTest> findByTestCode(final PsyQuesDto.testCodeParam testCodeParam);


}
