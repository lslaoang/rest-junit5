package io.lslaoang.restjunit5.domain;


import lombok.Data;

import java.util.List;

@Data
public class Diagnosis {

    enum STAGE{
        LOW,
        MEDIUM,
        HIGH
    }

    private List<String> healthIssue;
    private STAGE stage;

}
