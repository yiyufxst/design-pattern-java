package org.design.pattern.flyweight.test;

import org.design.pattern.flyweight.model.Student;
import org.design.pattern.flyweight.service.CourseSelectionService;
import org.design.pattern.flyweight.service.impl.CourseSelectionServiceImpl;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 选课测试类
 */
public class CourseSelectionTest {

    private CourseSelectionService courseSelectionService = new CourseSelectionServiceImpl();

    @Test
    public void testSelectCourse() {
        Map<String, String> courseDataMap = new HashMap<String, String>() {
            {
                put("id", "1");
                put("name", "高数一");
                put("credit", "5");
            }
        };
        Student studentA = new Student("1", "张三");
        courseSelectionService.selectCourse(studentA, courseDataMap);
        Student studentB = new Student("2", "李四");
        courseSelectionService.selectCourse(studentB, courseDataMap);
    }
}
