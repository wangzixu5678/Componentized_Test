package com.xinliutong.common;

/**
 * description :
 *
 * @author : wzx
 * email : 445826958@qq.com
 * date : 2019/9/25 16:04
 */
public class TestBean {
    private String name;
    private int age;

    public TestBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
