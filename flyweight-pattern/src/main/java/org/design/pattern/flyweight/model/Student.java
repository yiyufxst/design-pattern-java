package org.design.pattern.flyweight.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 学生信息
 */
@Getter
@AllArgsConstructor
public class Student {

    /**
     * 学号
     */
    private String id;

    /**
     * 姓名
     */
    private String name;
}
