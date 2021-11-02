package io.lslaoang.restjunit5.domain;

import java.util.List;

public class Diagnosis {

    enum STAGE{
        LOW,
        MEDIUM,
        HIGH
    }

    private List<String> healthIssue;
    private STAGE stage;

}
