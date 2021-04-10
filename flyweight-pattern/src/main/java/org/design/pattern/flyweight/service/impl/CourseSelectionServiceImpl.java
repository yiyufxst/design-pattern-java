package org.design.pattern.flyweight.service.impl;

import org.apache.commons.lang3.ObjectUtils;
import org.design.pattern.flyweight.factory.CourseFactory;
import org.design.pattern.flyweight.model.Course;
import org.design.pattern.flyweight.model.Student;
import org.design.pattern.flyweight.service.CourseSelectionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 选课服务实现
 */
public class CourseSelectionServiceImpl implements CourseSelectionService {

    private static final Logger log = LoggerFactory.getLogger(CourseFactory.class);

    /**
     * 选课
     *
     * @param student 学生
     * @param courseDataMap 课程数据
     */
    @Override
    public void selectCourse(Student student, Map<String, String> courseDataMap) {
        Course course = CourseFactory.getCourse(courseDataMap);
        if (ObjectUtils.isEmpty(course)) {
            log.error("course is not exist");
            return;
        }
        log.info(
                "student {} select {} course, the course credit is {}",
                student.getName(), student.getName(), course.getCredit()
        );
    }
}
