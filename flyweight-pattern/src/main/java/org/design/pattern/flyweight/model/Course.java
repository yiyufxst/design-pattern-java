package org.design.pattern.flyweight.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 课程
 */
@AllArgsConstructor
@Getter
public class Course {

    /**
     * 课程id
     */
    private String id;

    /**
     * 课程名
     */
    private String name;

    /**
     * 学分
     */
    private String credit;
}
