package io.lslaoang.restjunit5.domain;


import java.io.Serializable;

public class BaseEntity implements Serializable {
    private String name;
    private Integer age;
    private String address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
