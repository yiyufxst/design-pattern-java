package org.design.pattern.flyweight.factory;

import org.apache.commons.lang3.ObjectUtils;
import org.design.pattern.flyweight.model.Course;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 课程工厂
 */
public class CourseFactory {

    private static final Logger log = LoggerFactory.getLogger(CourseFactory.class);

    /**
     * 课程对象池
     */
    private static Map<String, Course> courseMap = new ConcurrentHashMap<String, Course>();

    /**
     * 获取课程
     *
     * @param dataMap 课程数据
     * @return Course
     */
    public static Course getCourse(Map<String, String> dataMap) {
        String id = dataMap.get("id");
        if (ObjectUtils.isEmpty(id)) {
            log.warn("course id is empty");
            return null;
        }
        if (ObjectUtils.isNotEmpty(courseMap.get(id))) {
            log.info("get cache course {}", id);
            return courseMap.get(id);
        } else {
            log.info("create new course {}", id);
            return createCourse(id, dataMap.get("name"), dataMap.get("credit"));
        }
    }

    /**
     * 创建课程
     *
     * @param id 课程id
     * @param name 课程名称
     * @param credit 学分
     */
    public static Course createCourse(String id, String name, String credit) {
        if (ObjectUtils.isNotEmpty(id) && ObjectUtils.isNotEmpty(name) && ObjectUtils.isNotEmpty(credit)) {
            Course course = new Course(id, name, credit);
            courseMap.put(id, course);
            return course;
        }
        return null;
    }
}
