package org.design.pattern.flyweight.service;

import org.design.pattern.flyweight.model.Student;

import java.util.Map;

/**
 * 选课服务接口
 */
public interface CourseSelectionService {

    /**
     * 选课
     *
     * @param student 学生
     * @param courseDataMap 课程数据
     */
    void selectCourse(Student student, Map<String, String> courseDataMap);
}
