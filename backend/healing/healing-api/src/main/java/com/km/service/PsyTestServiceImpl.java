package com.km.service;

import com.km.model.PsyQuesDto;
import com.km.repository.psyQues.PsyQuesRepositorySupport;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PsyTestServiceImpl implements PsyTestService{

    private final PsyQuesRepositorySupport psyQuesRepositorySupport;

    @Override
    public List<PsyQuesDto.psyTest> getPsyTestByTestCode(final PsyQuesDto.testCodeParam testCodeParam) {
        return psyQuesRepositorySupport.findByTestCode(testCodeParam);
    }

    @Override
    public int saveTestResult(PsyQuesDto.testResultParam testResultParam) {
        return 0;
    }

}
