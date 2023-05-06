package com.km.model;

import com.km.common.category.TestCode;
import lombok.Getter;

public class PsyQuesDto {

    @Getter
    public static class testCodeParam{
        private TestCode testCode;
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
