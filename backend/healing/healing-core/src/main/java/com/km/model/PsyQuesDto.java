package com.km.model;

import com.km.common.category.TestCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

public class PsyQuesDto {

    @Getter
    public static class testCodeParam{
        private TestCode testCode;
    }

    @Getter @Setter
    public static class testResultParam {
        private Long memberId;
        private Long memberTestId;
        private List<testResult> testResultList;
    }

    @Getter @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class testResult{
        private Long psyQuesId;
        private int point;
    }

    @Getter
    public static class psyTest{
        private Long id;
        private String question;

        public psyTest(Long id, String question) {
            this.id = id;
            this.question = question;
        }
    }

}
